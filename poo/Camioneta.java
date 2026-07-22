public class Camioneta extends Vehiculo{
    private int capacidadCarga;
    private boolean tieneCuatroXCuatro;

    public Camioneta(String marca, int patente, String modelo, int kilometraje, int capacidadCarga, boolean tieneCuatroXCuatro) {
        super(marca, patente, modelo, kilometraje);
        this.capacidadCarga = capacidadCarga;
        this.tieneCuatroXCuatro = tieneCuatroXCuatro;
    }
    // Getters y Setters
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public boolean isTieneCuatroXCuatro() {
        return tieneCuatroXCuatro;
    }

    public void setTieneCuatroXCuatro(boolean tieneCuatroXCuatro) {
        this.tieneCuatroXCuatro = tieneCuatroXCuatro;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfoVehiculo() {
        super.mostrarInfoVehiculo();
        System.out.println("Capacidad de carga: " + capacidadCarga);
        System.out.println("Tiene 4x4: " + tieneCuatroXCuatro); 
    }
}