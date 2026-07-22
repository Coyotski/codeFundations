# Generador de descripciones de muebles

def generar_mueble():
    diseño = input("Diseño (moderno/clasico): ")
    material = input("Material (madera/metal/plastico): ")
    color = input("Color (red/yellow/green): ")
    largo = float(input("Largo (ej. 1.80, 2.00, 1.50): "))
    ancho = float(input("Ancho (ej. 1.80, 2.00, 1.50): "))
    peso = float(input("Peso (ej. 40, 60, 80): "))
    estructura = input("Estructura (asiento, respaldo, brazos, patas): ")
    espacios = int(input("Número de espacios (1,2,3,4,6): "))
    clasificacion = input("Clasificación (individual, doble, triple, infantil): ")

    descripcion = f"""
    Has creado un mueble con las siguientes características:
    - Diseño: {diseño}
    - Material: {material}
    - Color: {color}
    - Medidas: {largo}m x {ancho}m
    - Peso: {peso}kg
    - Estructura: {estructura}
    - Espacios: {espacios}
    - Clasificación: {clasificacion}
    """
    print(descripcion)

# Ejecutar
generar_mueble()
