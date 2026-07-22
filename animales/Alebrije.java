package animales;

public class Alebrije extends Animal {
    // Atributos específicos de Alebrije
    private String color;
    private String forma;
    private int patas;

    // Constructor
    public Alebrije(String nombre, int edad, String color, String forma, int patas) {
        super(nombre, edad);
        this.color = color;
        this.forma = forma;
        this.patas = patas;
    }

    // Métodos específicos de Alebrije
    public void volar() {
        System.out.println(nombre + " está volando en una noche de luna nueva.");
    }

    public void petrificarse(String motivo, String nuevaForma) {
        System.out.println(nombre + " se está haciendo piedra por:" + motivo  );
        this.forma = nuevaForma;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo almas.");
    }
    public void comer(String almaEnPena) {
        System.out.println(nombre + " está comiendo el alma en pena de " + almaEnPena + ".");
    }
    public void morir() {
        System.out.println(nombre + " ha muerto y se ha convertido en cenizas.");
    }
    public void morir(String ritual) {
        System.out.println(nombre + " ha muerto tras el ritual de " + ritual + " y se ha convertido en cenizas.");
    }
    
}