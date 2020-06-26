/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Adicionales.Aderezo;
import Postres.Pastel;
import Postres.Helado;
import Postres.Postre;
/**
 *
 * @author Carlos
 */
public class ManejadorDePrecios {
    private static double iva=0.12;

    public ManejadorDePrecios(Postre postre) {
        iva=this.iva;
    }
    public static double showPrecioFinal(Postre postre){
        double costo=postre.getPrecioParcial();
        double toppings=postre.getAderezos().size()*0.5;
        
        double precioFinal=costo+(costo*iva)+toppings;
        System.out.println("Precio Final: $ " +precioFinal);
        return precioFinal;
    }

    
}
