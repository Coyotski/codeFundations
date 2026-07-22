-- Insertar puestos
INSERT INTO puestos (nombre, descripcion, salario_base)
VALUES
('Auxiliar administrativo', 'Tareas administrativas y atención a usuarios', 8000.00),
('Técnico especializado', 'Mantenimiento y soporte técnico', 12000.00),
('Analista de datos', 'Procesamiento y análisis de información', 15000.00);

-- Insertar usuarios
INSERT INTO usuarios (nombre, correo, telefono, fecha_nacimiento, puesto_id)
VALUES
('Juan Pérez', 'juan.perez1@example.com', '1234567890', '1985-01-15', 2),
('Ana Gómez', 'ana.gomez2@example.com', '1234567891', '1990-03-22', 1),
('Luis Martinez', 'luis.martinez3@example.com', '1234567892', '1988-07-10', 3),
('Maria López', 'maria.lopez4@example.com', '1234567893', '1992-11-05', 1),
('Carlos Ruiz', 'carlos.ruiz5@example.com', '1234567894', '1980-06-25', 2);

-- Insertar credenciales
INSERT INTO credenciales_usuarios (id_usuario, username, password_hash)
VALUES
(1, 'juan.perez1', 'hash_juan_perez'),
(2, 'ana.gomez2', 'hash_ana_gomez'),
(3, 'luis.martinez3', 'hash_luis_martinez'),
(4, 'maria.lopez4', 'hash_maria_lopez'),
(5, 'carlos.ruiz5', 'hash_carlos_ruiz');
