public class Main {
    public static void main(String[] args) {
        // Creación de instancias de MontañaRusa, Noria y AutitosChocadores
        MontañaRusa montañaRusa = new MontañaRusa("Montaña Rusa Extrema", 20, 5, "Alta");
        Noria noria = new Noria("Noria Gigante", 30, 10, 50);
        AutitosChocadores autitosChocadores = new AutitosChocadores("Autitos Chocadores", 15, 3, 10);

        // Prueba de los métodos implementados en MontañaRusa
        montañaRusa.iniciar();             // La montaña rusa está en marcha
        montañaRusa.detener();            // La atracción se ha detenido
        montañaRusa.realizarMantenimiento(); // Realizando mantenimiento en la montaña rusa
        System.out.println(montañaRusa.estadoMantenimiento()); // false
        montañaRusa.aumentarIntensidad();  // Aumentando la intensidad de la montaña rusa

        // Prueba de los métodos implementados en Noria
        noria.iniciar();                  // La noria está girando
        noria.detener();                 // La atracción se ha detenido
        noria.realizarMantenimiento();    // Realizando mantenimiento en la noria
        System.out.println(noria.estadoMantenimiento()); // false

        // Prueba de los métodos implementados en AutitosChocadores
        autitosChocadores.iniciar();      // Los autitos chocadores están en marcha
        autitosChocadores.iniciar(8);    // Los autitos chocadores están en marcha con 8 autitos en funcionamiento
        autitosChocadores.detener();     // La atracción se ha detenido
        autitosChocadores.realizarMantenimiento(); // Realizando mantenimiento en los autitos chocadores
        System.out.println(autitosChocadores.estadoMantenimiento()); // false
    }
}