package implementation.hotdog;

import patronbridge.IPreparar;
import patronbridge.Preparacion;

/**
 *
 * @author Sergio Ramirez
 */

public class HotDog extends Preparacion {

    public HotDog(IPreparar implement) {
        this.setImplementador(implement);
    }

    @Override
    public void obtener() {
        System.out.println("Tu perro caliente esta saliendo...");
        this.getImplementador().procesar();
    }
}
