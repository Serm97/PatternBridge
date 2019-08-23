package implementation.burguer;

import patronbridge.IPreparar;

/**
 *
 * @author Sergio Ramirez
 */

public class OffRoad implements IPreparar {

    public OffRoad() {
    }

    @Override
    public void procesar() {
        System.out.println(">> Hamburguesa Todo Terreno, Lista!!!\n");
    }
}
