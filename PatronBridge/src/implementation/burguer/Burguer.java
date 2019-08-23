package implementation.burguer;

import patronbridge.IPreparar;
import patronbridge.Preparacion;

/**
 *
 * @author Sergio Ramirez
 */

public class Burguer extends Preparacion {

    public Burguer(IPreparar implement) {
        this.setImplementador(implement);
    }

    @Override
    public void obtener() {
        System.out.println("Ensamblando Hamburguesa...");
        this.getImplementador().procesar();
    }
}
