public class AlebrijeMiriam extends Animal  {
    // Atributos simbólicos
    private String coloresAqua;
    private String coloresAire;
    private String simbolismo;
    

    // Constructor
    public AlebrijeMiriam(String coloresAqua, String coloresAire, String simbolismo) {
        super("Miriam", "Alebrije Mágico", 100, 50.0);
        this.coloresAqua = coloresAqua;
        this.coloresAire = coloresAire;
        this.simbolismo = simbolismo;
        
    }

    // Métodos de acceso (getters)
    public String getColoresAqua() {
        return coloresAqua;
    }

    public String getColoresAire() {
        return coloresAire;
    }

    public String getSimbolismo() {
        return simbolismo;
    }

    // Método simbólico: volar
    public void volar() {
        System.out.println("El alebrije extiende sus alas y vuela entre los sueños.");
        System.out.println("Sus colores aqua reflejan la profundidad del agua,");
        System.out.println("mientras los colores aire revelan la espiritualidad.");
    }

    // Método opcional para describir el simbolismo completo
    public void describirSimbolismo() {
        System.out.println("Simbolismo: " + simbolismo);
        System.out.println("Colores Aqua: " + coloresAqua);
        System.out.println("Colores Aire: " + coloresAire);
    }
    
    //metodos que faltan de la interfaz
   
    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo el alma en pena de "  + ".");
    }
    @Override
    public boolean morir() {
        System.out.println(nombre + " ha muerto tras el ritual de "  + " y se ha convertido en cenizas.");
        return true;
    }
}
