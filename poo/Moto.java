public class Moto extends Vehiculo {
   private int cilindrada;
   // Constructor
    public Moto(String marca, int patente, String modelo, int kilometraje, int cilindrada) {
         super(marca, patente, modelo, kilometraje);
         this.cilindrada = cilindrada;
    }
    // Getter y Setter
    public int getCilindrada() {
        return cilindrada;
    }   
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    @Override
    public void mostrarInfoVehiculo() {
        super.mostrarInfoVehiculo();
        System.out.println("Cilindrada: " + cilindrada);
    }   
}
