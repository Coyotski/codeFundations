-- Crear tabla usuarios
CREATE TABLE usuarios (
    id_usuario SERIAL PRIMARY KEY,
    nombre VARCHAR(188) NOT NULL,
    correo VARCHAR(255) UNIQUE,
    telefono VARCHAR(15),
    fecha_nacimiento DATE,
    puesto_id INT
);

-- Crear tabla credenciales_usuarios
CREATE TABLE credenciales_usuarios (
    id_credencial SERIAL PRIMARY KEY,
    id_usuario INT NOT NULL,
    username VARCHAR(58) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

-- Crear tabla puestos
CREATE TABLE puestos (
    id_puesto SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    salario_base NUMERIC(12,2),
    activo BOOLEAN DEFAULT TRUE,
    fecha_alta DATE DEFAULT CURRENT_DATE
);

-- Relación usuarios con puestos
ALTER TABLE usuarios
ADD CONSTRAINT fk_usuarios_puestos
FOREIGN KEY (puesto_id) REFERENCES puestos(id_puesto);
