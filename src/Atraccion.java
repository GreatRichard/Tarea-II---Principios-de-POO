// Clase abstracta Atraccion
public abstract class Atraccion {
    private String nombre;
    private int capacidadMaxima;
    private int duracion; // duración en minutos

    // Constructor que inicializa los atributos nombre, capacidadMaxima y duracion
    public Atraccion(String nombre, int capacidadMaxima, int duracion) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.duracion = duracion;
    }

    // Getters y setters para los atributos privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void iniciar();

    // Método concreto que imprime un mensaje indicando que la atracción se ha detenido
    public void detener() {
        System.out.println("La atracción se ha detenido");
    }
}