// se genera un arreglo o lista de Alebrijes que conforman un equipo
public class EquipoAlebrije {
    private Alebrije[] miembros;

    public EquipoAlebrije(Alebrije[] miembros) {
        this.miembros = miembros;
    }
    public boolean equipoMayorACero() {
        return miembros.length > 0;
    }
    public boolean equipoMayorAUno() {
        
        boolean varRetorno;
        if (miembros.length > 1) {
            varRetorno = true;
        } else {
            varRetorno = false;
        }
        return varRetorno;
    }
    public Alebrije[] getMiembros() {
        return miembros;
    }
    
}
    