public class Main {
    // método principal para probar las clases
    public static void main(String[] args) {
        vehiculo miCoche = new Coche();
        miCoche.encender();
        miCoche.cargarGasolina(50);
        miCoche.acelerar(100);
        miCoche.girar("izquierda");
        miCoche.frenar(50);
        miCoche.apagar();
        miCoche.mostrarEstado();

        System.out.println();

        vehiculo miMoto = new Moto();
        miMoto.encender();
        miMoto.cargarGasolina(-20);
        miMoto.acelerar(60);
        miMoto.girar("derecha");
        miMoto.frenar(30);
       // miMoto.apagar();
        miMoto.mostrarEstado();
        System.out.println();

        vehiculo miAvion = new Avion();
        miAvion.encender();
        miAvion.cargarGasolina(200);
        miAvion.acelerar(300);
        miAvion.girar("izquierda");
        miAvion.frenar(150);
        miAvion.apagar();
        miAvion.mostrarEstado();    
    }
}
