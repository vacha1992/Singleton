/*
 * Este archivo contiene el programa principal (main method) donde se ejemplifica el uso del patrón Singleton. 
 * Se obtiene la instancia única de SingletonExample y se llama al método showMessage para demostrar que la instancia es la misma.
 */

package principal;

/**
 *
 * @author Chava
 */
public class MainSingletonExample {
    public static void main(String[] args) {
        // Obtener la instancia única de SingletonExample
        SingletonExample singletonInstance1 = SingletonExample.getInstance();
        singletonInstance1.showMessage();

        // Intentar crear otra instancia, pero se obtendrá la misma instancia ya existente
        SingletonExample singletonInstance2 = SingletonExample.getInstance();
        singletonInstance2.showMessage();
    }
}
