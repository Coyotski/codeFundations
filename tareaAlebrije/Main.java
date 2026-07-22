public class Main {
    public static void main(String[] args) {
        // Crear algunos Alebrijes
        Alebrije alebrije1 = new Alebrije("Xolo", "Perro", 5, 12.5, "Rojo", "Canino", 4, 0);
        Alebrije alebrije2 = new Alebrije("Luna", "Gato", 3, 8.0, "Azul", "Felino", 4, 2);
        AlebrijeMiriam alebrijeMiriam = new AlebrijeMiriam("","","");
        // Crear un equipo de Alebrijes
        Alebrije[] miembros = {alebrije1, alebrije2};
        EquipoAlebrije equipo = new EquipoAlebrije(miembros);

        // Verificar si el equipo tiene más de un miembro
        if (equipo.equipoMayorAUno()) {
            System.out.println("El equipo tiene " + equipo.getMiembros().length + " miembros.");
            // Probar el método programar
            alebrije1.programar(equipo);
        } else {
            System.out.println("El equipo no tiene suficientes miembros para programar.");
        }

        // Probar el método prestarLibro
        alebrije1.prestarLibro("El Arte de la Magia");

        // Probar otros métodos mágicos
        alebrije1.comer("alma perdida");    
        alebrije1.morir("ritual ancestral");
        alebrije1.saludar();
        alebrije1.despedirse();
        alebrije1.jugarALaPelota();
        alebrije1.dormir();
        
        //saludar entres 2 alebrijes de diferentes clases
        alebrije1.SaludarAnimal(alebrijeMiriam);

        alebrijeMiriam.SaludarAnimal(alebrije1);
        
    
    }
}
