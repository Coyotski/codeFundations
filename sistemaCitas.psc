Algoritmo sistemaCitas
	// ingresa el numero de personas que haran cita
	Definir numeroPersonas Como Entero
	Imprimir "Bienvenido al sistema de citas, ingrese el numero de personas que agendaran cita"
	leer numeroPersonas
	Si numeroPersonas <= 0 Entonces
		Escribir "No hay solicitudes. Fin del programa."

	FinSi
	
	Dimension nombres[numeroPersonas] 
	Dimension tiempos[numeroPersonas] 
	
	Definir tiempo como entero
	Definir nombre como cadena 
	
	Definir tiempoAux Como Entero
	Definir nombreAux como cadena
	// registra las solicitudes 
	
	Para i <- 1 hasta numeroPersonas  Con Paso 1 Hacer
		Escribir "Escribe el nombre de la persona ", i,": "
		leer nombre
		Escribir "Escribe el tiempo estimado de la cita (min 1, max 120): " 
		leer tiempo 
		
		//validar tiempo
		si tiempo >120 Entonces //poner una alerta de tiempo maximo excedido
			tiempo = 120
			Escribir "tiempo maximo excedido se asignara 120 min"
		FinSi
		
		si tiempo <= 0
			tiempo = 1
			Escribir "tiempo no puede ser menor que cero, se asignara un minuto "
		FinSi
		
		
		tiempos[i]<- tiempo 
		nombres[i]<- nombre

		
	FinPara
	
	// Mostrar lista original
	Escribir "---> ", "Lista original capturada"
	Escribir "  "
	para i <- 1 hasta numeroPersonas Con Paso 1 Hacer
		Escribir nombres[i], "---", tiempos[i], " minutos"
	
	FinPara
	
	//espera original 
	Dimension esperaOriginal[numeroPersonas]
	esperaOriginal[1] <- 0   // el primero no espera
	
	Para i <- 2 Hasta numeroPersonas Con Paso 1 Hacer
		esperaOriginal[i] <- esperaOriginal[i-1] + tiempos[i-1]
	FinPara
	
	//Ordenamiento por tiempo 
	Para i <- 1 hasta numeroPersonas Con Paso 1 hacer 
		Escribir "iteracion ", i, ":"
		Escribir "  "
		para j <- 1 hasta numeroPersonas-1 Con Paso 1 hacer 
			Escribir "comparando " nombres[j], "-->", tiempos[j] " con ", nombres[j+1], "-->", tiempos[j+1]
			si tiempos[j] > tiempos[j+1] 
				Escribir "  "
				Escribir "--  se intercambian"
				//intercambiar tiempos
				tiempoAux <- tiempos[j]
				tiempos[j]<- tiempos[j+1]
				tiempos[j+1]<- tiempoAux
				
				//intercambiar nombres
				nombreAux<- nombres[j]
				nombres[j]<- nombres[j+1]
				nombres[j+1]<- nombreAux
				
				
			FinSi
			
		FinPara
		Escribir "  "
		Escribir "Estado actual de la lista: "
		Para k<- 1 hasta numeroPersonas Con Paso 1 Hacer
			
			Escribir " - ", nombres[k], " - ", tiempos[k] " minutos"
		FinPara
	FinPara
	
	//calcular tiempos de Espera
	Dimension tiempoEs[numeroPersonas]
	tiempoEs[1]<-0 // el primero no espera
	Para i<-2 Hasta numeroPersonas Con Paso 1 Hacer
		tiempoEs[i]<- tiempoEs[i-1] + tiempos[i-1]
	FinPara
	
	//Imprimir resultados finales
	Escribir " "
	Escribir "Turno - Nombre - Tiempo de cita - Espera - Tiempo de espera sin ordenar"
	para i<-1 hasta numeroPersonas Con Paso 1 Hacer
		Escribir i ," -     ", nombres[i],"    ", tiempos[i], " minutos", "       ", tiempoEs[i], " minutos","   ", esperaOriginal[i], " minutos"
	FinPara
	
	
	
FinAlgoritmo
