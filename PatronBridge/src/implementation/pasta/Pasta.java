/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.pasta;

import patronbridge.IPreparar;
import patronbridge.Preparacion;

public class Pasta extends Preparacion {

    public Pasta(IPreparar implementador) {
        this.setImplementador(implementador);
    }

    // ------------------------
    @Override
    public void obtener() {
        System.out.println("Preparando pasta...");
        this.getImplementador().procesar();
    }
}
