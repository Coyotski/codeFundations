package animales;

public class Caballo extends Mamifero {
    private String raza;
    
    public Caballo() {
        super();
    }
    
    public Caballo(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    
    // Método específico agregado
    public void comer() {
        System.out.println(nombre + " el caballo está comiendo hierba y avena.");
    }
    
    // Método específico de caballos
    public void galopar() {
        System.out.println(nombre + " está galopando por el campo.");
    }
    
    @Override
    public void comunicar() {
        System.out.println(nombre + " relincha para comunicarse.");
    }
    
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
   

}