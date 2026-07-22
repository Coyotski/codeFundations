public class ReglasSin{
   
   //atributos
    int longitudMinima;
    int longitudMaxima;
    //constructor de la clase

    public ReglasSin(int longitudMinima, int longitudMaxima) {
        this.longitudMinima = longitudMinima;
        this.longitudMaxima = longitudMaxima;
    }
    //metodos de validacion
    
    public boolean debeTenerLongitudCorrecta(String texto) {
        int longitud = 0;
        for (char c : texto.toCharArray()) {
            longitud++;
        }
        return longitud >= longitudMinima && longitud <= longitudMaxima;
    }

    public boolean debeContenerMayusculas(String texto) {
        for (char c : texto.toCharArray()) {
            if (c >= 'A' && c <= 'Z') return true;
        }
        return false;
    }

    public boolean debeContenerMinusculas(String texto) {
        for (char c : texto.toCharArray()) {
            if (c >= 'a' && c <= 'z') return true;
        }
        return false;
    }

    public boolean debeContenerNumeros(String texto) {
        for (char c : texto.toCharArray()) {
            if (c >= '0' && c <= '9') return true;
        }
        return false;
    }

    public boolean debeContenerSimbolos(String texto) {
        char[] simbolos = {
            '!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
            '-', '_', '=', '+', '[', ']', '{', '}', '|', ';',
            ':', '\'', '"', ',', '.', '<', '>', '/', '?', '`', '~'
        };
        for (char c : texto.toCharArray()) {
            for (char s : simbolos) {
                if (c == s) return true;
            }
        }
        return false;
    }

    public boolean noDebeContenerEspacios(String texto) {
        for (char c : texto.toCharArray()) {
            if (c == ' ') return false;
        }
        return true;
    }

    public boolean todasReglasCumplidas(String texto) {
        return debeTenerLongitudCorrecta(texto) &&
               debeContenerMayusculas(texto) &&
               debeContenerMinusculas(texto) &&
               debeContenerNumeros(texto) &&
               debeContenerSimbolos(texto) &&
               noDebeContenerEspacios(texto);
    }

    public static void main(String[] args) {
        ReglasSin reglas = new ReglasSin(8, 20);
        String password = "PollitoChiken123!";
        if (reglas.todasReglasCumplidas(password)) {
            System.out.println(" La contraseña cumple con todas las reglas.");
        } else {
            System.out.println(" La contraseña no cumple con todas las reglas.");
        }
    }
}