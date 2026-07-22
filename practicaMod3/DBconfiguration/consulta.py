import psycopg2
import getpass
import hashlib

# Configuración de conexión a la base de datos en Docker
DB_HOST = "localhost"
DB_PORT = "5433"
DB_NAME = "gestion_usuarios"
DB_USER = "Admin"
DB_PASSWORD = "p4sswOrdDB"

def conectar_db():
    """Conecta a la base de datos PostgreSQL y retorna la conexión."""
    try:
        conn = psycopg2.connect(
            host=DB_HOST,
            port=DB_PORT,
            database=DB_NAME,
            user=DB_USER,
            password=DB_PASSWORD
        )
        return conn
    except Exception as e:
        print("Error de conexión a la base de datos:", e)
        return None

def hash_password(password: str) -> str:
    """Genera el hash SHA256 de una contraseña."""
    return hashlib.sha256(password.encode('utf-8')).hexdigest()

def obtener_datos_usuario(username, password):
    """Consulta la base de datos para obtener los datos de un usuario a partir de sus credenciales."""
    conn = conectar_db()
    if not conn:
        return
    
    try:
        cursor = conn.cursor()
        # Hash de la contraseña ingresada
        password_hash = hash_password(password)
        
        # Verificar si el usuario y contraseña existen en la tabla credenciales_usuarios
        query = """
            SELECT u.id_usuario, u.nombre, u.correo, u.telefono, u.fecha_nacimiento
            FROM credenciales_usuarios c
            JOIN usuarios u ON c.id_usuario = u.id_usuario
            WHERE c.username = %s AND c.password_hash = %s;
        """
        cursor.execute(query, (username, password_hash))
        usuario = cursor.fetchone()
        
        if usuario:
            print("\nDatos del usuario encontrado:")
            print(f"ID: {usuario[0]}")
            print(f"Nombre: {usuario[1]}")
            print(f"Correo: {usuario[2]}")
            print(f"Teléfono: {usuario[3]}")
            print(f"Fecha de Nacimiento: {usuario[4]}")
        else:
            print("\nUsuario o contraseña incorrectos.")
        
        cursor.close()
        conn.close()
    except Exception as e:
        print("Error al consultar la base de datos:", e)

if __name__ == "__main__":
    print("Inicio de sesión en la base de datos")
    
    # Solicitar credenciales al usuario
    username = input("Ingrese su usuario: ")
    
    # Opción 1: Con getpass (seguro, pero no ves lo que escribes)
    # password = getpass.getpass("Ingrese su contraseña: ")
    
    # Opción 2: Con input normal (SOLO para pruebas - se ve la contraseña)
    password = input("Ingrese su contraseña (VISIBLE): ")
    
    # Consultar la base de datos
    obtener_datos_usuario(username, password)