/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Sistema;

/**
 *
 * @author Jorge
 */
public class VentanaPrincipal {
    
    private Sistema sistema;

    public VentanaPrincipal(Sistema sistema) {
        this.sistema = sistema;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
    
}
