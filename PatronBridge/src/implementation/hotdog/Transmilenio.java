package implementation.hotdog;

import patronbridge.IPreparar;

/**
 *
 * @author Sergio Ramirez
 */

public class Transmilenio implements IPreparar {

    public Transmilenio() {
    }

    @Override
    public void procesar() {
        System.out.println(">> Listo tu Transmilenio :).\n");
    }
}
