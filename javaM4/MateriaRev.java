
import java.time.LocalDate;

public class MateriaRev {
    //atributos
    public String nombre;
    public int creditos;
    public String clave;
    //comportamiento
    public void mostrarInformacion(){
        System.out.println("Nombre de la materia: " + nombre);
        System.out.println("Créditos: " + creditos);
        System.out.println("Clave: " + clave);
    }
    
    public boolean abiertaInscripcion() {
        // Supongamos que las inscripciones son todo el mes de noviembre
       LocalDate actual = LocalDate.now();
       int mes = actual.getMonthValue(); // Los meses en Java van de 1 a 12
       return mes == 8;
        /*if (mes == 11) {
        return true;
         } else {
        return false;
        }*/
     } 

    //main para probar la clase Materia
    public static void main(String[] args) {
        // Crear una instancia de la clase MateriaRev
        MateriaRev materia1 = new MateriaRev();
        materia1.nombre = "Física";
        materia1.creditos = 4;
        materia1.clave = "FIS201";

        // Probar los métodos de la clase MateriaRev
        materia1.mostrarInformacion();
        if (materia1.abiertaInscripcion()) {
            System.out.println("La inscripción está abierta.");
        } else {
            System.out.println("La inscripción está cerrada.");
        }
    }
}