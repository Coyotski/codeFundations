package animales;

public class Rana extends Anfibio {
    private String Color;
    
    public Rana() {
        super();
    }
    
    public Rana(String nombre, int edad, String Color) {
        super(nombre, edad);
        this.Color = Color;
    }
    
    // Método específico agregado
    public void comer() {
        System.out.println(nombre + " la rana está comiendo insectos.");
    }
    
    // Método específico de ranas
    public void saltar() {
        System.out.println(nombre + " está saltando en una hoja.");
    }
    
    @Override
    public void comunicar() {
        System.out.println(nombre + " croa para comunicarse");
    }
    
    public String getColor() {
        return Color;
    }
    
    public void setColor(String Color) {
        this.Color = Color;
    }
}