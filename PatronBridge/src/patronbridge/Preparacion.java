    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge;

public abstract class Preparacion {
    
    // Referencia al Implementador
    IPreparar implementador;

    public IPreparar getImplementador() {
        return this.implementador;
    }

    public void setImplementador(IPreparar implementador) {
        this.implementador = implementador;
    }

    
    // Método a implementar por las clases que hereden
    public abstract void obtener();
}
