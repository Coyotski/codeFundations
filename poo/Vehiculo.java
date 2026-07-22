// Crear una clase que permita representar los vehículos de una concesionaria de autos.
public class Vehiculo { 
    // Atributos
    private String marca;
    private int patente ;
    private String modelo;
    private int kilometraje;
    
    // Constructor
    public Vehiculo(String marca, int patente, String modelo, int kilometraje) {        
        this.marca = marca;
        this.patente = patente;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }
    // Getters
    public String getMarca() {
        return marca;
    }

    public int getPatente() {
        return patente;
    }   
    public String getModelo() {
        return modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }           
    public void setPatente(int patente) {
        this.patente = patente;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    public void mostrarInfoVehiculo() {
        // muestra la info del vehiculo
        System.out.println("Marca: " + marca + ", Patente: " + patente + ", Modelo: " + modelo + ", Kilometraje: " + kilometraje );
    }
    //metodo para actualizar el kilometraje
    public void actualizarKilometraje(int nuevoKilometraje) {
        if (nuevoKilometraje > this.kilometraje) {
            this.kilometraje = nuevoKilometraje;
        } else {
            System.out.println("El nuevo kilometraje debe ser mayor que el actual.");
        }
    }   
    //sobrecarga del metodo actualizar kilometraje
    public void actualizarKilometraje(int nuevoKilometraje, String unidad) {
        int kilometrajeEnKm = nuevoKilometraje;
        if (unidad.equalsIgnoreCase("millas")) {
            kilometrajeEnKm = (int)(nuevoKilometraje * 1.60934); // Convertir millas a kilómetros
        }
        actualizarKilometraje(kilometrajeEnKm);
    }   

  
}