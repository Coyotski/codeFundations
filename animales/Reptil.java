package animales;

public class Reptil extends Animal {
    
    public Reptil() {
        super();
    }
    
    public Reptil(String nombre, int edad) {
        super(nombre, edad);
    }
    
    // Método específico de reptiles
    public void comunicar() {
        System.out.println(nombre + " se comunica como todo un reptil.");
    }
    
    // Método específico de reptiles
    public void mudarPiel() {
        System.out.println(nombre + " está mudando la piel.");
    }
    
}