// Clase Noria que extiende Atraccion e implementa Mantenimiento
public class Noria extends Atraccion implements Mantenimiento {
    private int alturaMaxima; // Atributo adicional

    // Constructor que inicializa los atributos mediante el constructor de la clase base
    public Noria(String nombre, int capacidadMaxima, int duracion, int alturaMaxima) {
        super(nombre, capacidadMaxima, duracion);
        this.alturaMaxima = alturaMaxima;
    }

    // Implementación del método abstracto iniciar para Noria
    @Override
    public void iniciar() {
        System.out.println("La noria está girando");
    }

    // Implementación del método realizarMantenimiento de la interfaz Mantenimiento
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en la noria");
    }

    // Implementación del método estadoMantenimiento de la interfaz Mantenimiento
    @Override
    public boolean estadoMantenimiento() {
        // Aquí se puede añadir la lógica para determinar si necesita mantenimiento
        return false; // Por defecto, no necesita mantenimiento
    }

    // Getter para el atributo alturaMaxima
    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    // Setter para el atributo alturaMaxima
    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
}