// Clase Gato que extiende Animal e implementa Alimentable
public class Gato extends Animal implements Alimentable {

    // Constructor que inicializa los atributos mediante el constructor de la clase base
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto hacerSonido para Gato
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }

    // Implementación del método comer de la interfaz Alimentable
    @Override
    public void comer() {
        System.out.println("El gato está comiendo");
    }

    // Implementación del método beber de la interfaz Alimentable
    @Override
    public void beber() {
        System.out.println("El gato está bebiendo");
    }
}