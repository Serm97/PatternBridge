package implementation.burguer;

import patronbridge.IPreparar;

/**
 *
 * @author Sergio Ramirez
 */

public class Vegetarian implements IPreparar {

    public Vegetarian() {
    }

    @Override
    public void procesar() {
        System.out.println(">> Hamburguesa Vegetariana, Lista!!!\n");
    }
}
