public class Avion implements vehiculo {
    private int velocidad;
    private boolean encendido;
    private int jetfuel;

    public Avion() {
        this.velocidad = 0;
        this.encendido = false;
        this.jetfuel = 0;
    }

    @Override
    public void acelerar(int incremento) {
        if (encendido && jetfuel > 0) {
            velocidad += incremento;
            jetfuel -= incremento / 8; // consumo de jetfuel
            System.out.println("Avion acelerado a " + velocidad + " km/h");
        } else {
            System.out.println("El avion no puede acelerar. Está apagado o sin jetfuel.");
        }
    }

    @Override
    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) velocidad = 0;
        System.out.println("Avion frenado a " + velocidad + " km/h");
    }

    @Override
    public void girar(String direccion) {
        System.out.println("Avion girando a la " + direccion);
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Avion encendido");
    }

    @Override
    public void apagar() {
        encendido = false;
        velocidad = 0;
        System.out.println("Avion apagado");
    }

    @Override
    public void cargarGasolina(int cantidad) {
        jetfuel += cantidad;
        System.out.println("Avion cargado con " + cantidad + " litros de jetfuel. Total: " + jetfuel + " litros.");
    }
    @Override
    public void mostrarEstado() {
        System.out.println("Estado del avion:");
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Encendido: " + (encendido ? "Sí" : "No"));
        System.out.println("Jetfuel: " + jetfuel + " litros");
    }
}