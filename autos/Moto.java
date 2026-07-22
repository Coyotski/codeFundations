
public class Moto implements vehiculo {     
    private int velocidad;
    private boolean encendido;
    private int gasolina;

    public Moto() {
        this.velocidad = 0;
        this.encendido = false;
        this.gasolina = 0;
    }

    @Override
    public void acelerar(int incremento) {
        if (encendido && gasolina > 0) {
            velocidad += incremento;
            gasolina -= incremento / 15; // consumo de gasolina
            System.out.println("Moto acelerada a " + velocidad + " km/h");
        } else {
            System.out.println("La moto no puede acelerar. Está apagada o sin gasolina.");
        }
    }

    @Override
    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) velocidad = 0;
        System.out.println("Moto frenada a " + velocidad + " km/h");
    }

    @Override
    public void girar(String direccion) {
        System.out.println("Moto girando a la " + direccion);
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Moto encendida, sino enciende usa el pedal de arranque");
    }

    @Override
    public void apagar() {
        encendido = false;
        velocidad = 0;
        System.out.println("Moto apagada");
    }

    @Override
    public void cargarGasolina(int cantidad) {
        gasolina += cantidad;
        System.out.println("Moto cargada con " + cantidad + " litros de gasolina. Total: " + gasolina + " litros.");
    }
    
    @Override
    public void mostrarEstado() {
        System.out.println("Estado de la moto:");
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Encendido: " + (encendido ? "Sí" : "No"));
        System.out.println("Gasolina: " + gasolina + " litros");
    }
}