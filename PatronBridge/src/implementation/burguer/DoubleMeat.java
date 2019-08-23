package implementation.burguer;

import patronbridge.IPreparar;

/**
 *
 * @author Sergio Ramirez
 */

public class DoubleMeat implements IPreparar {

    public DoubleMeat() {
    }

    @Override
    public void procesar() {
        System.out.println(">> Hamburguesa Doble Carne, Lista!!!\n");
    }
}
