package implementation.hotdog;

import patronbridge.IPreparar;

/**
 *
 * @author Sergio Ramirez
 */

public class Simple implements IPreparar {

    public Simple() {
    }

    @Override
    public void procesar() {
        System.out.println(">> Listo Perro Caliente Sencillo:).\n");
    }
}
