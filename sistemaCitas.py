# Algoritmo sistemaCitas en Python

# Ingreso del número de personas
numeroPersonas = int(input("Bienvenido al sistema de citas, ingrese el numero de personas que agendaran cita: "))

if numeroPersonas <= 0:
    print("No hay solicitudes. Fin del programa.")
    exit()

# Inicializar listas con tamaño numeroPersonas +1 para usar índices desde 1
nombres = ["" for _ in range(numeroPersonas + 1)]
tiempos = [0 for _ in range(numeroPersonas + 1)]
esperaOriginal = [0 for _ in range(numeroPersonas + 1)]

# Variables auxiliares
tiempoAux = 0
nombreAux = ""

# Registrar solicitudes
for i in range(1, numeroPersonas + 1):
    nombre = input(f"Escribe el nombre de la persona {i}: ")
    tiempo = int(input("Escribe el tiempo estimado de la cita (min 1, max 120): "))

    # Validar tiempo
    if tiempo > 120:
        tiempo = 120
        print("Tiempo máximo excedido, se asignará 120 min")
    if tiempo <= 0:
        tiempo = 1
        print("Tiempo no puede ser menor que cero, se asignará 1 min")

    tiempos[i] = tiempo
    nombres[i] = nombre

# Mostrar lista original
print("---> Lista original capturada\n")
for i in range(1, numeroPersonas + 1):
    print(f"{nombres[i]} --- {tiempos[i]} minutos")

# Calcular espera original
esperaOriginal[1] = 0
for i in range(2, numeroPersonas + 1):
    esperaOriginal[i] = esperaOriginal[i-1] + tiempos[i-1]

# Ordenamiento por tiempo 
for i in range(1, numeroPersonas + 1):
    print(f"\nIteración {i}:")
    for j in range(1, numeroPersonas):
        print(f"Comparando {nombres[j]} --> {tiempos[j]} con {nombres[j+1]} --> {tiempos[j+1]}")
        if tiempos[j] > tiempos[j+1]:
            print("--  se intercambian")
            # Intercambiar tiempos
            tiempoAux = tiempos[j]
            tiempos[j] = tiempos[j+1]
            tiempos[j+1] = tiempoAux

            # Intercambiar nombres
            nombreAux = nombres[j]
            nombres[j] = nombres[j+1]
            nombres[j+1] = nombreAux

    print("\nEstado actual de la lista: ")
    for k in range(1, numeroPersonas + 1):
        print(f" - {nombres[k]} - {tiempos[k]} minutos")

# Calcular tiempos de espera optimizados
tiempoEs = [0 for _ in range(numeroPersonas + 1)]
tiempoEs[1] = 0
for i in range(2, numeroPersonas + 1):
    tiempoEs[i] = tiempoEs[i-1] + tiempos[i-1]

# Imprimir resultados finales
print("\nTurno - Nombre - Tiempo de cita - Espera - Tiempo de espera sin ordenar")
for i in range(1, numeroPersonas + 1):
    print(f"{i} - {nombres[i]} - {tiempos[i]} minutos - {tiempoEs[i]} minutos - {esperaOriginal[i]} minutos")
