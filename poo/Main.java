

public class Main {
    public static void main(String[] args) {
       //Crear un objeto auto
       System.out.println("Información del Auto:");
        Vehiculo miAuto = new Auto("Toyota", 1234, "Corolla", 50000, 4, false);
        miAuto.mostrarInfoVehiculo();
        //imprimir una linea de separacion
        System.out.println("---------------------------");
        //Crear un objeto camioneta
        System.out.println("Información de la Camioneta:");
        Vehiculo miCamioneta = new Camioneta("Ford", 5678, "F-150", 30000, 1000, true );
        miCamioneta.mostrarInfoVehiculo();
        //imprimir una linea de separacion
        System.out.println("---------------------------");
        //prueba de actualizar kilometraje
        System.out.println("Actualizando kilometraje del auto:");
        miAuto.actualizarKilometraje(55000);
        miCamioneta.actualizarKilometraje(35000, "millas");  
        //imprimir info actualizada
        System.out.println("Información actualizada del Auto:");  
        miAuto.mostrarInfoVehiculo();
        System.out.println("Información actualizada de la Camioneta:");  
        miCamioneta.mostrarInfoVehiculo();
        //imprimir una linea de separacion
        System.out.println("---------------------------");
        //generar moto,mostrar info y actualizar kilometraje
        System.out.println("Información de la Moto:");
        Moto miMoto = new Moto("Honda", 9012, "CBR600RR", 15000, 600);
        miMoto.mostrarInfoVehiculo();
        System.out.println("Actualizando kilometraje de la moto:");
        miMoto.actualizarKilometraje(16000);  
        //imprimir info actualizada
        System.out.println("Información actualizada de la Moto:");  
        miMoto.mostrarInfoVehiculo();
    }
}
