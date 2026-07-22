package animales;

public class Anfibio extends Animal {
    
    public Anfibio() {
        super();
    }
    
    public Anfibio(String nombre, int edad) {
        super(nombre, edad);
    }
    
    // Método específico de anfibios
    public void comunicar() {
        System.out.println(nombre + " se comunica con sonidos de anfibio.");
    }
    
    // Método específico de anfibios
    public void metamorfosis() {
        System.out.println(nombre + " está pasando por metamorfosis.");
    }
    
   
}