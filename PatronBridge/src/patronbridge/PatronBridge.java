/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge;


import implementation.burguer.Burguer;
import implementation.burguer.DoubleMeat;
import implementation.burguer.OffRoad;
import implementation.hotdog.HotDog;
import implementation.hotdog.Sausage;
import implementation.hotdog.Transmilenio;
import implementation.pasta.Bolonesa;
import implementation.pasta.Pasta;
import implementation.pasta.Espinacas;

public class PatronBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
            Preparacion pasta = new Pasta(new Bolonesa());
            pasta.obtener();

            // Ahora le indicamos que use otra implementación para obtener la de verduras
            pasta.setImplementador(new Espinacas());
            pasta.obtener();

            Preparacion burger = new Burguer(new DoubleMeat());
            burger.obtener();

            burger.setImplementador(new OffRoad());
            burger.obtener();

            Preparacion hotdog = new HotDog(new Transmilenio());
            hotdog.obtener();

            hotdog.setImplementador(new Sausage());
            hotdog.obtener();
        }
    }

}
