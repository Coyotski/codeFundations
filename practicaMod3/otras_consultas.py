import psycopg2
import hashlib
from acceso import conectar_db, hash_password

def listar_usuarios():
    """Lista todos los usuarios con información de su puesto"""
    conn = conectar_db()
    if not conn:
        return False, "No se pudo conectar a la BD"
    
    try:
        cursor = conn.cursor()
        query = """
            SELECT u.id_usuario, u.nombre, u.correo, u.telefono, 
                   u.fecha_nacimiento, p.nombre as puesto, p.salario_base
            FROM usuarios u 
            LEFT JOIN puestos p ON u.puesto_id = p.id_puesto
            ORDER BY u.id_usuario;
        """
        cursor.execute(query)
        usuarios = cursor.fetchall()
        
        print("\n=== LISTA DE USUARIOS ===")
        print(f"{'ID':<3} {'Nombre':<15} {'Correo':<25} {'Teléfono':<12} {'Puesto':<20} {'Salario':<10}")
        print("-" * 90)
        
        for usuario in usuarios:
            print(f"{usuario[0]:<3} {usuario[1]:<15} {usuario[2]:<25} {usuario[3]:<12} {usuario[5] or 'Sin puesto':<20} ${usuario[6] or 0:<9}")
        
        cursor.close()
        return True, f"Se encontraron {len(usuarios)} usuarios"
    except Exception as e:
        return False, f"Error al listar usuarios: {e}"
    finally:
        conn.close()

def buscar_usuario_por_username(username):
    """Busca un usuario por su username"""
    conn = conectar_db()
    if not conn:
        return False, "No se pudo conectar a la BD"
    
    try:
        cursor = conn.cursor()
        query = """
            SELECT u.nombre, u.correo, c.username, p.nombre as puesto
            FROM usuarios u 
            JOIN credenciales_usuarios c ON u.id_usuario = c.id_usuario
            LEFT JOIN puestos p ON u.puesto_id = p.id_puesto
            WHERE c.username = %s;
        """
        cursor.execute(query, (username,))
        resultado = cursor.fetchone()
        
        if resultado:
            print(f"\n=== USUARIO ENCONTRADO ===")
            print(f"Nombre: {resultado[0]}")
            print(f"Correo: {resultado[1]}")
            print(f"Username: {resultado[2]}")
            print(f"Puesto: {resultado[3] or 'Sin puesto'}")
            cursor.close()
            return True, "Usuario encontrado"
        else:
            cursor.close()
            return False, "Usuario no encontrado"
    except Exception as e:
        return False, f"Error al buscar usuario: {e}"
    finally:
        conn.close()

def listar_puestos():
    """Lista todos los puestos disponibles"""
    conn = conectar_db()
    if not conn:
        return False, "No se pudo conectar a la BD"
    
    try:
        cursor = conn.cursor()
        query = "SELECT * FROM puestos ORDER BY id_puesto;"
        cursor.execute(query)
        puestos = cursor.fetchall()
        
        print("\n=== LISTA DE PUESTOS ===")
        print(f"{'ID':<3} {'Nombre':<25} {'Descripción':<40} {'Salario Base':<12} {'Activo':<6}")
        print("-" * 90)
        
        for puesto in puestos:
            activo = "Sí" if puesto[4] else "No"
            print(f"{puesto[0]:<3} {puesto[1]:<25} {puesto[2]:<40} ${puesto[3]:<11} {activo:<6}")
        
        cursor.close()
        return True, f"Se encontraron {len(puestos)} puestos"
    except Exception as e:
        return False, f"Error al listar puestos: {e}"
    finally:
        conn.close()

def validar_credenciales(username, password):
    """Valida las credenciales de un usuario"""
    conn = conectar_db()
    if not conn:
        return False, "No se pudo conectar a la BD"
    
    try:
        cursor = conn.cursor()
        query = """
            SELECT c.password_hash, u.nombre 
            FROM credenciales_usuarios c
            JOIN usuarios u ON c.id_usuario = u.id_usuario
            WHERE c.username = %s;
        """
        cursor.execute(query, (username,))
        resultado = cursor.fetchone()
        
        if resultado:
            password_hash_bd = resultado[0]
            nombre_usuario = resultado[1]
            password_hash_input = hash_password(password)
            
            if password_hash_bd == password_hash_input:
                cursor.close()
                return True, f"Credenciales válidas para {nombre_usuario}"
            else:
                cursor.close()
                return False, "Contraseña incorrecta"
        else:
            cursor.close()
            return False, "Usuario no encontrado"
    except Exception as e:
        return False, f"Error al validar credenciales: {e}"
    finally:
        conn.close()

def menu_interactivo():
    """Menu interactivo para realizar operaciones"""
    while True:
        print("\n=== SISTEMA DE GESTIÓN DE USUARIOS ===")
        print("1. Listar todos los usuarios")
        print("2. Buscar usuario por username")
        print("3. Listar puestos disponibles")
        print("4. Validar credenciales de usuario")
        print("5. Registrar nuevo usuario")
        print("6. Salir")
        
        opcion = input("\nSelecciona una opción (1-6): ").strip()
        
        if opcion == "1":
            success, msg = listar_usuarios()
            print(f"\n{msg}")
            
        elif opcion == "2":
            username = input("Ingresa el username a buscar: ").strip()
            success, msg = buscar_usuario_por_username(username)
            print(f"\n{msg}")
            
        elif opcion == "3":
            success, msg = listar_puestos()
            print(f"\n{msg}")
            
        elif opcion == "4":
            username = input("Ingresa el username: ").strip()
            password = input("Ingresa la contraseña: ").strip()
            success, msg = validar_credenciales(username, password)
            print(f"\n{msg}")
            
        elif opcion == "5":
            print("\n=== REGISTRO DE NUEVO USUARIO ===")
            nombre = input("Nombre completo: ").strip()
            correo = input("Correo electrónico: ").strip()
            telefono = input("Teléfono: ").strip()
            fecha_nac = input("Fecha de nacimiento (YYYY-MM-DD): ").strip()
            username = input("Username: ").strip()
            password = input("Contraseña: ").strip()
            
            # Mostrar puestos disponibles
            print("\nPuestos disponibles:")
            listar_puestos()
            puesto_id = input("ID del puesto: ").strip()
            
            try:
                from acceso import registrar_usuario
                puesto_id = int(puesto_id)
                success, msg = registrar_usuario(nombre, correo, telefono, fecha_nac, username, password, puesto_id)
                print(f"\n{msg}")
            except ValueError:
                print("\nError: ID de puesto debe ser un número")
            except Exception as e:
                print(f"\nError: {e}")
                
        elif opcion == "6":
            print("¡Hasta luego!")
            break
            
        else:
            print("Opción no válida. Por favor selecciona una opción del 1 al 6.")

if __name__ == "__main__":
    # Ejecutar algunas consultas de ejemplo
    print("=== PRUEBAS AUTOMÁTICAS ===")
    
    # Listar usuarios
    success, msg = listar_usuarios()
    print(f"Listar usuarios: {msg}")
    
    # Buscar usuario
    success, msg = buscar_usuario_por_username("nuevo.user")
    print(f"Buscar usuario: {msg}")
    
    # Listar puestos
    success, msg = listar_puestos()
    print(f"Listar puestos: {msg}")
    
    # Probar validación de credenciales
    success, msg = validar_credenciales("nuevo.user", "miContraseña123")
    print(f"Validar credenciales: {msg}")
    
    # Iniciar menú interactivo
    print("\n" + "="*50)
    menu_interactivo()