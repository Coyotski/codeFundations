//clase Alebrije que implementa la interfaz Fantastico
public class Alebrije extends Animal implements Fantastico {

    private String color;
    private String forma;
    private int patas;
    private int ojos;

    public Alebrije(String nombre, String especie, int edad, double peso,
                    String color, String forma, int patas, int ojos) {
        super(nombre, especie, edad, peso);
        this.color = color;
        this.forma = forma;
        this.patas = patas;
        this.ojos = ojos;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando en una noche de luna nueva.");
    }

    @Override
    public void petrificarse() {
        System.out.println(nombre + " se está petrificando por causas mágicas.");
    }

    // Sobrecarga adicional
    public void petrificarse(String motivo) {
        System.out.println(nombre + " se ha petrificado debido a " + motivo + ".");
        this.forma = motivo;
    }

    @Override
    public void comer(String almaEnPena) {
        System.out.println(nombre + " está comiendo el alma en pena de " + almaEnPena + ".");
    }

    @Override
    public boolean morir(String ritual) {
        System.out.println(nombre + " ha muerto tras el ritual de " + ritual + " y se ha convertido en cenizas.");
        return true;
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo almas.");
    }

    @Override
    public boolean morir() {
        System.out.println(nombre + " ha muerto y se ha convertido en cenizas.");
        return true;
    }
    @Override
    public void saludar() { 
        System.out.println(nombre + " saluda con un gesto mágico.");
    }   
    @Override
    public void despedirse() {
        System.out.println(nombre + " se despide con un gesto mágico.");
    }
    @Override
    public void jugarALaPelota() {
        System.out.println(nombre + " juega a la pelota con magia.");
    }
    @Override
    public boolean dormir() {
        System.out.println(nombre + " está durmiendo mágicamente.");
        return true;
    }
    @Override 
    //si el allebrije no tiene ojos no puede prestar libros
    public void prestarLibro(String titulo) {
        if (this.ojos > 0) {
            System.out.println(nombre + " presta el libro mágico titulado: " + titulo + ".");
        } else {
            System.out.println(nombre + " no puede prestar libros porque no tiene ojos.");
        }
    }
    @Override
    //los alebrijes hacen codigo solo en equipos de alebrijes con mas de 1 integrante
    public void programar(EquipoAlebrije equipo) {
        if (equipo.equipoMayorAUno()) {
            System.out.println(nombre + " está programando con su equipo de alebrijes.");
        } else {
            System.out.println(nombre + " no puede programar, el equipo debe tener más de 1 integrante.");
        }
    }
   
}