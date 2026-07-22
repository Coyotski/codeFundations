public interface vehiculo {
    void acelerar(int incremento);
    void frenar(int decremento);
    void girar(String direccion);
    void encender();
    void apagar();
    void cargarGasolina(int cantidad);
    void mostrarEstado();
    
}
