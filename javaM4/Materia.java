public class Materia {
    //atributos
    public String nombre;
    public int creditos;
    public String clave;
    //comportamiento
    public void inscibirAlumno(){
        System.out.println("Inscribiendo alumno a la materia: " + nombre);
    }
    public void asignarProfesor(){
        System.out.println("Asignando profesor a la materia: " + nombre);
    }
    public void eliminarAlumno(){
        System.out.println("Eliminando alumno de la materia: " + nombre);
    }

    //main para probar la clase Materia
    public static void main(String[] args) {
        // Crear una instancia de la clase Materia
        Materia materia1 = new Materia();
        materia1.nombre = "Matemáticas";
        materia1.creditos = 5;
        materia1.clave = "MAT101";

        // Probar los métodos de la clase Materia
        materia1.inscibirAlumno();
        materia1.asignarProfesor();
        materia1.eliminarAlumno();
    }
}
