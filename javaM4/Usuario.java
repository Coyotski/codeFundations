public class Usuario {
// atributos
    public String nombreUsuario;
    public String telefonoUsuario;
    public String rolUsuario;
    
    //comportamiento
    public void mostrarInformacion(){
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Tipo de usuario: " + telefonoUsuario);
        System.out.println("Rol de usuario: " + rolUsuario);
    }
    
    //constructor de la clase
    public Usuario(String nombreUsuario, String telefonoUsuario, String rolUsuario) {
       this.nombreUsuario = nombreUsuario;
       this.telefonoUsuario = telefonoUsuario;          
       this.rolUsuario = rolUsuario;
    }

    //main para probar la clase Usuario
    public static void main(String[] args) {
        // Crear una instancia de la clase Usuario
        Usuario usuario1 = new Usuario("juanPerez", "1234567890", "gestor");

        // Probar el método de la clase Usuario
        usuario1.mostrarInformacion();
    }
}
