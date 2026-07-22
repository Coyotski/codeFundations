package animales;

public class Main {
    public static void main(String[] args) {
        System.out.println("PRUEBAS DE HERENCIA - JERARQUÍA DE ANIMALES\n");
        
        // Crear objetos de cada clase
        System.out.println("--- CREANDO ANIMALES ---");
        Caballo caballo = new Caballo("Spirit", 8, "Mustang");
        Perro perro = new Perro("Max", 5, "Golden Retriever");
        Rana rana = new Rana("Verde", 2, "Laguna");
        Serpiente serpiente = new Serpiente("Cobra", 4, true);
        
        System.out.println("Todos los animales han sido creados.\n");
        
        // Probar métodos heredados de Animal
        System.out.println("--- PROBANDO MÉTODOS DE LA CLASE ANIMAL ---");
        caballo.nacer();
        perro.respirar();
        rana.morir();
        serpiente.respirar();
        System.out.println();
        
        
        // Probar métodos de clases intermedias (Mamifero, Anfibio, Reptil)
        System.out.println("--- PROBANDO MÉTODOS DE CLASES INTERMEDIAS ---");
        caballo.comunicar();
        perro.comunicar();
        rana.comunicar();
        serpiente.comunicar();
        System.out.println();
        
        // Probar métodos específicos de cada clase
        System.out.println("--- PROBANDO MÉTODOS ESPECÍFICOS ---");
        caballo.comer();
        caballo.galopar();
        
        perro.morder();
        perro.comer();
        
        rana.comer();
        rana.saltar();
        
        serpiente.reptar();
        serpiente.cazar();
        System.out.println();
        
        // Probar polimorfismo
       caballo.respirar();
        perro.respirar();   
        rana.respirar();
        serpiente.respirar();
        
        //crear un mamifero y usar el metodo sobreescrito
        Mamifero mamifero = new Mamifero("Leon", 6);
        mamifero.respirar();
        mamifero.respirar(10);

        // Probar composición con Corazon
        System.out.println("\n--- PROBANDO COMPOSICIÓN CON CORAZÓN ---");
        Corazon corazonCaballo = new Corazon();
        caballo.setCorazon(corazonCaballo);
        caballo.getCorazon().latir();
        
        // Finalizar pruebas
        System.out.println("--- PRUEBAS FINALIZADAS ---");  
    }
}
