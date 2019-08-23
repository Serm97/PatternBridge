/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.pasta;

import patronbridge.IPreparar;

/**
 *
 * @author saul enrique camargo
 */
public class Bolonesa implements IPreparar {

    public Bolonesa() {
    }

    @Override
    public void procesar() {
        System.out.println("\tPasta de Boloñesa Elaborada");
    }
}
