FROM postgres:latest

# Copia scripts SQL al contenedor para inicialización automática
COPY init.sql /docker-entrypoint-initdb.d/
COPY save_data.sql /docker-entrypoint-initdb.d/
