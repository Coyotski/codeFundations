package animales;

public class Mamifero extends Animal {
    
    public Mamifero() {
        super();
    }
    
    public Mamifero(String nombre, int edad) {
        super(nombre, edad);
    }
    
    // Método específico de mamíferos
    public void comunicar() {
        System.out.println(nombre + " se comunica con sonidos de mamifero.");
    }
    
    // Método específico de mamíferos
    public void darLeche() {
        System.out.println(nombre + " está alimentando a sus crías con leche.");
    }
    
    @Override
    public void respirar() {
        System.out.println(nombre + " el mamífero está respirando con sus pulmones.");
    }
    public void respirar(int minutos) {
        System.out.println(nombre + " el mamífero está respirando con sus pulmones durante " + minutos + " minutos.");
    }
}