// Clase Main para probar el sistema
public class Main {
    public static void main(String[] args) {
        // Creación de instancias de Perro y Gato con sus respectivos nombres y edades
        Perro perro = new Perro("Rex", 5);
        Gato gato = new Gato("Mimi", 3);

        // Prueba de los métodos implementados en Perro
        perro.hacerSonido();  // El perro ladra
        perro.comer();        // El perro está comiendo
        perro.beber();        // El perro está bebiendo
        perro.dormir();       // El animal está durmiendo
        perro.hacerTruco();   // El perro está haciendo un truco
        perro.hacerTruco("saltar");  // El perro está haciendo el truco: saltar

        // Prueba de los métodos implementados en Gato
        gato.hacerSonido();   // El gato maúlla
        gato.comer();         // El gato está comiendo
        gato.beber();         // El gato está bebiendo
        gato.dormir();        // El animal está durmiendo
    }
}