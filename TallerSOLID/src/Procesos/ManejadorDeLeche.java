/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;


import Postres.*;
import Leche.*;

/**
 *
 * @author Pedro Mendoza
 */
public class ManejadorDeLeche {
    
    private Leche leche;  

    public ManejadorDeLeche(Leche leche) {
        this.leche = leche;
    }
    
    public void cambiarTipoLeche(Object postre){
        // Cambiar tipo de leche en la preparación de los postres, usar leche deslactosada
        System.out.println(postre.getClass());
        System.out.println(Pastel.class);
        this.leche = new LecheDeslactosada();
        if(postre.getClass() == Pastel.class){
            System.out.println("No se puede usar en pastel");
        }else{
            leche.usarHelado();
        }
    }
    
}
