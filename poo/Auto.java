//clase Auto hereda de Vehiculo
public class Auto extends Vehiculo {
    // Atributos
    private int cantidadPuertas;
    private boolean esConvertible;

    // Constructor
    public Auto(String marca, int patente, String modelo, int kilometraje, int cantidadPuertas, boolean esConvertible) {
        super(marca, patente, modelo, kilometraje);
        this.cantidadPuertas = cantidadPuertas;
        this.esConvertible = esConvertible;
    }

    // Getters
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public boolean isEsConvertible() {
        return esConvertible;
    }

    // Setters
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public void setEsConvertible(boolean esConvertible) {
        this.esConvertible = esConvertible;
    }

    // Método para mostrar información del auto
    @Override 
    public void mostrarInfoVehiculo()   {
        super.mostrarInfoVehiculo();
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
        System.out.println("Es convertible: " + esConvertible);
    }
}