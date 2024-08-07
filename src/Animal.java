// Clase abstracta Animal
public abstract class Animal {
    private String nombre;
    private int edad;

    // Constructor que inicializa los atributos nombre y edad
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters para acceder y modificar los atributos privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void hacerSonido();

    // Método concreto que imprime un mensaje indicando que el animal está durmiendo
    public void dormir() {
        System.out.println("El animal está durmiendo");
    }
}