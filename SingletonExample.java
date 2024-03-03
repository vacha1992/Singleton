/*
 * Este archivo define la clase SingletonExample, que implementa el patrón Singleton. 
 * Contiene una instancia única de la clase y un método getInstance que devuelve esa instancia. 
 * En este caso, el Singleton no tiene ninguna lógica específica relacionada con bases de datos,
 * solo garantiza que haya una única instancia de la clase en toda la aplicación.
 */

package principal;

/**
 *
 * @author Chava
 */
public class SingletonExample {
    private static SingletonExample instance;

    // Constructor privado para evitar la instanciación directa
    private SingletonExample() {
        System.out.println("Instancia de SingletonExample creada.");
    }

    // Método para obtener la instancia única
    public static synchronized SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    // Otros métodos y atributos de la clase
    public void showMessage() {
        System.out.println("Hola, soy una instancia de SingletonExample.");
    }
}

