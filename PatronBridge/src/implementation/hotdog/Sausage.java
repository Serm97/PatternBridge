package implementation.hotdog;

import patronbridge.IPreparar;

/**
 *
 * @author Sergio Ramirez
 */

public class Sausage implements IPreparar {
    public Sausage() {
    }


    @Override
    public void procesar() {
        System.out.println(">> Listo tu ChoriPerro :).\n");
    }
}
