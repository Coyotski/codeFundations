package animales;

public class Perro extends Mamifero {
    private String raza;
    
    public Perro() {
        super();
    }
    
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    
    // Método específico agregado
    public void comer() {
        System.out.println(nombre + " el perro está comiendo croquetas y carne.");
    }
    
    // Método específico de perros
    public void morder() {
        System.out.println(nombre + " está mordiendo.");
    }
    
    @Override
    public void comunicar() {
        System.out.println(nombre + " ladra para comunicarse.");
    }
    
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
}