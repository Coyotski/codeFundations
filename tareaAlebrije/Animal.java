// Clase base para los Alebrijes
public abstract class Animal {
    protected String nombre;
    protected String especie;
    protected int edad;
    protected double peso;

    public Animal(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    // Métodos abstractos que deben implementar las subclases
    public abstract void comer();
    public abstract boolean morir();

    // Métodos concretos comunes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void SaludarAnimal( Animal animal2) {
        System.out.println("El animal " + this.getNombre() + " saluda a  " + animal2.getNombre() );
    }
}
