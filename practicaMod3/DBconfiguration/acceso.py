import psycopg2
import hashlib

DB_HOST = "localhost"
DB_PORT = "5433"
DB_NAME = "gestion_usuarios"
DB_USER = "Admin"
DB_PASSWORD = "p4sswOrdDB"

def conectar_db():
    try:
        return psycopg2.connect(
            host=DB_HOST,
            port=DB_PORT,
            database=DB_NAME,
            user=DB_USER,
            password=DB_PASSWORD
        )
    except Exception as e:
        print("Error de conexión:", e)
        return None

def hash_password(password: str) -> str:
    return hashlib.sha256(password.encode('utf-8')).hexdigest()

def registrar_usuario(nombre, correo, telefono, fecha_nacimiento, username, password, puesto_id):
    conn = conectar_db()
    if not conn:
        return False, "No se pudo conectar a la BD"
    try:
        cursor = conn.cursor()
        insert_usuario = """
            INSERT INTO usuarios (nombre, correo, telefono, fecha_nacimiento, puesto_id)
            VALUES (%s, %s, %s, %s, %s)
            RETURNING id_usuario;
        """
        cursor.execute(insert_usuario, (nombre, correo, telefono, fecha_nacimiento, puesto_id))
        id_usuario = cursor.fetchone()[0]

        pw_hash = hash_password(password)
        insert_cred = """
            INSERT INTO credenciales_usuarios (id_usuario, username, password_hash)
            VALUES (%s, %s, %s);
        """
        cursor.execute(insert_cred, (id_usuario, username, pw_hash))

        conn.commit()
        cursor.close()
        return True, f"Usuario registrado con id {id_usuario}"
    except Exception as e:
        conn.rollback()
        return False, f"Error durante registro: {e}"
    finally:
        conn.close()

if __name__ == "__main__":
    success, msg = registrar_usuario(
        'Manuel', 'manuel@epc.com', '5551234567', '1989-01-01', 'manuel.user', 'miContraseñaDificil', 2
    )
    print(success, msg)
