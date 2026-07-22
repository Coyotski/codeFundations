//clase coche que implementa la interfaz vehiculo
public class Coche implements vehiculo {
    private int velocidad;
    private boolean encendido;
    private int gasolina;

    public Coche() {
        this.velocidad = 0;
        this.encendido = false;
        this.gasolina = 0;
    }

    @Override
    public void acelerar(int incremento) {
        if (encendido && gasolina > 0) {
            velocidad += incremento;
            gasolina -= incremento / 10; // consumo de gasolina
            System.out.println("Coche acelerado a " + velocidad + " km/h");
        } else {
            System.out.println("El coche no puede acelerar. Está apagado o sin gasolina.");
        }
    }

    @Override
    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) velocidad = 0;
        System.out.println("Coche frenado a " + velocidad + " km/h");
    }

    @Override
    public void girar(String direccion) {
        System.out.println("Coche girando a la " + direccion);
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Coche encendido");
    }

    @Override
    public void apagar() {
        encendido = false;
        velocidad = 0;
        System.out.println("Coche apagado");
    }

    @Override
    public void cargarGasolina(int cantidad) {
        gasolina += cantidad;
        System.out.println("Coche cargado con " + cantidad + " litros de gasolina. Total: " + gasolina + " litros.");
    }
    @Override
    public void mostrarEstado() {
        System.out.println("Estado del coche:");
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Encendido: " + (encendido ? "Sí" : "No"));
        System.out.println("Gasolina: " + gasolina + " litros");
    }
}