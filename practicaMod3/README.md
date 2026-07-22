# Práctica Módulo 3 - Gestión de Bases de Datos

## Estructura de carpetas

```
practicaMod3/
├── DBconfiguration/
│   ├── docker-compose.yaml
│   ├── Dockerfile
│   ├── init.sql
│   ├── save_data.sql
│   └── acceso.py
└── README.md
```

## Descripción de archivos

- docker-compose.yaml: Contenedor PostgreSQL, puerto 5433.
- Dockerfile: Copia scripts SQL al contenedor.
- init.sql: Crea tablas usuarios, credenciales_usuarios y puestos.
- save_data.sql: Inserta datos iniciales.
- acceso.py: Script para registrar usuarios con hash de contraseña.

## Uso

1. Abrir VS Code y abrir carpeta practicaMod3.
2. Terminal en DBconfiguration.
3. Levantar contenedor: docker-compose up -d
4. Ejecutar Python: python acceso.py
5. Acceder a la base de datos:
   docker exec -it ContDBpractMod3 bash
   psql -U Admin -d gestion_usuarios
   SELECT * FROM usuarios;
   SELECT * FROM credenciales_usuarios;
   SELECT * FROM puestos;
