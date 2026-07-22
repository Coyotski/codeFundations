public class Reglas {
    int longitudMinima;
    int longitudMaxima;

 //constructor de la clase
    public Reglas(int longitudMinima, int longitudMaxima) {
        this.longitudMinima = longitudMinima;
        this.longitudMaxima = longitudMaxima;
    }

    //metodos de validacion
    public boolean  debeTenerLongitudCorrecta(String texto) {
        //logica para validar longitud
        int longitud = texto.length();
        if (longitud < longitudMinima || longitud > longitudMaxima) {
        // manejar error de longitud
            return false;  
        }
        return true;
    }   
    public boolean  debeContenerMayusculas(String texto) {
        //logica para validar mayusculas
        return texto.chars().anyMatch(Character::isUpperCase);

    }
    public boolean debeContenerMinusculas(String texto) {
        //logica para validar minusculas
        return texto.chars().anyMatch(Character::isLowerCase);
    }
    public boolean debeContenerNumeros(String texto) {
        //logica para validar numeros
        return texto.chars().anyMatch(Character::isDigit);      
    }   
    public boolean debeContenerSimbolos(String texto ) {
        //logica para validar simbolos
        String simbolos = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";
        return texto.chars().anyMatch(c -> simbolos.indexOf(c) >= 0);
    }

   public boolean noDebeContenerEspacios(String texto) {
        //logica para validar espacios
        return !texto.contains(" ");
    }
    
    public boolean todasReglasCumplidas(String texto) {
        return debeTenerLongitudCorrecta(texto) &&
               debeContenerMayusculas(texto) &&
               debeContenerMinusculas(texto) &&
               debeContenerNumeros(texto) &&
               debeContenerSimbolos(texto) &&
               noDebeContenerEspacios(texto);
    }


    //getters y setters
    public int getLongitudMinima() {
        return longitudMinima;
    }
    public void setLongitudMinima(int longitudMinima) {
        this.longitudMinima = longitudMinima;
    }
    public int getLongitudMaxima() {
        return longitudMaxima;
    }
    public void setLongitudMaxima(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
    
    }

    public static void main(String[] args) {
        Reglas reglas = new Reglas(8, 20);   
        String password = "PollitoChiken"; //ejemplo contraseña que si cukmple PollitoChiken123!
        if (reglas.todasReglasCumplidas(password)) {
            System.out.println("La contraseña cumple con todas las reglas.");
        } else {
            System.out.println("La contraseña no cumple con todas las reglas.");
        }
    }


}