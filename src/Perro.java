// Clase Perro que extiende Animal e implementa Alimentable
public class Perro extends Animal implements Alimentable {

    // Constructor que inicializa los atributos mediante el constructor de la clase base
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto hacerSonido para Perro
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    // Implementación del método comer de la interfaz Alimentable
    @Override
    public void comer() {
        System.out.println("El perro está comiendo");
    }

    // Implementación del método beber de la interfaz Alimentable
    @Override
    public void beber() {
        System.out.println("El perro está bebiendo");
    }

    // Método sobrecargado hacerTruco sin parámetros
    public void hacerTruco() {
        System.out.println("El perro está haciendo un truco");
    }

    // Método sobrecargado hacerTruco con un parámetro que indica el nombre del truco
    public void hacerTruco(String truco) {
        System.out.println("El perro está haciendo el truco: " + truco);
    }
}