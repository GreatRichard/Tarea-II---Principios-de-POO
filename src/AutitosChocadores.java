// Clase AutitosChocadores que extiende Atraccion e implementa Mantenimiento
public class AutitosChocadores extends Atraccion implements Mantenimiento {
    private int numeroDeAutitos; // Atributo adicional

    // Constructor que inicializa los atributos mediante el constructor de la clase base
    public AutitosChocadores(String nombre, int capacidadMaxima, int duracion, int numeroDeAutitos) {
        super(nombre, capacidadMaxima, duracion);
        this.numeroDeAutitos = numeroDeAutitos;
    }

    // Implementación del método abstracto iniciar para AutitosChocadores
    @Override
    public void iniciar() {
        System.out.println("Los autitos chocadores están en marcha");
    }

    // Sobrecarga del método iniciar con un parámetro int
    public void iniciar(int numeroDeAutitos) {
        System.out.println("Los autitos chocadores están en marcha con " + numeroDeAutitos + " autitos en funcionamiento");
    }

    // Implementación del método realizarMantenimiento de la interfaz Mantenimiento
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en los autitos chocadores");
    }

    // Implementación del método estadoMantenimiento de la interfaz Mantenimiento
    @Override
    public boolean estadoMantenimiento() {
        // Aquí se puede añadir la lógica para determinar si necesita mantenimiento
        return false; // Por defecto, no necesita mantenimiento
    }

    // Getter para el atributo numeroDeAutitos
    public int getNumeroDeAutitos() {
        return numeroDeAutitos;
    }

    // Setter para el atributo numeroDeAutitos
    public void setNumeroDeAutitos(int numeroDeAutitos) {
        this.numeroDeAutitos = numeroDeAutitos;
    }
}