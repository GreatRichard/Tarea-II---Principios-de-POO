// Clase MontañaRusa que extiende Atraccion e implementa Mantenimiento
public class MontañaRusa extends Atraccion implements Mantenimiento {
    private String intensidad; // Atributo adicional

    // Constructor que inicializa los atributos mediante el constructor de la clase base
    public MontañaRusa(String nombre, int capacidadMaxima, int duracion, String intensidad) {
        super(nombre, capacidadMaxima, duracion);
        this.intensidad = intensidad;
    }

    // Implementación del método abstracto iniciar para MontañaRusa
    @Override
    public void iniciar() {
        System.out.println("La montaña rusa está en marcha");
    }

    // Implementación del método realizarMantenimiento de la interfaz Mantenimiento
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en la montaña rusa");
    }

    // Implementación del método estadoMantenimiento de la interfaz Mantenimiento
    @Override
    public boolean estadoMantenimiento() {
        // Aquí se puede añadir la lógica para determinar si necesita mantenimiento
        return false; // Por defecto, no necesita mantenimiento
    }

    // Getter para el atributo intensidad
    public String getIntensidad() {
        return intensidad;
    }

    // Setter para el atributo intensidad
    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    // Método para aumentar la intensidad en un nivel
    public void aumentarIntensidad() {
        // Aquí se puede implementar la lógica para aumentar la intensidad
        System.out.println("Aumentando la intensidad de la montaña rusa");
    }
}