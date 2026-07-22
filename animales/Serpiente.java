package animales;

public class Serpiente extends Reptil {
    private boolean esVenenosa;
    
    public Serpiente() {
        super();
    }
    
    public Serpiente(String nombre, int edad, boolean esVenenosa) {
        super(nombre, edad);
        this.esVenenosa = esVenenosa;
    }
    
    // Método específico de serpientes
    public void reptar() {
        System.out.println(nombre + " está reptando por el suelo.");
    }
    
    // Método específico de serpientes
    public void cazar() {
        if (esVenenosa) {
            System.out.println(nombre + " está cazando con su veneno.");
        } else {
            System.out.println(nombre + " está cazando sin veneno.");
        }
    }
    
    @Override
    public void comunicar() {
        System.out.println(nombre + " suena su cascabel para comunicarse.");
    }
    
    public boolean isEsVenenosa() {
        return esVenenosa;
    }
    
    public void setEsVenenosa(boolean esVenenosa) {
        this.esVenenosa = esVenenosa;
    }
}