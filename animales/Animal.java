package animales;

public class Animal {
    protected String nombre;
    protected int edad;
    
    
    // Constructor
    public Animal() {
    }
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Métodos básicos de todo animal
    public void nacer() {
        System.out.println(nombre + " ha nacido.");
    }
    
    public void respirar() {
        System.out.println(nombre + " está respirando.");
    }
    
    public void morir() {
        System.out.println(nombre + " ha muerto.");
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    private Corazon corazon;

    // Métodos para la composición con Corazon
    
    public Corazon getCorazon() {
        return corazon;
    }
    
    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }   
}