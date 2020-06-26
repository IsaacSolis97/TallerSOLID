/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Pedro Mendoza
 */
public abstract class Aderezo {
    String nombre;
    public abstract void setNombre(String nombre);
    
    @Override
    public String toString(){
        return this.nombre.toUpperCase();
    }
}
class Malvaviscos extends Aderezo{

    @Override
    public void setNombre(String nombre) {
        super.nombre = nombre;
    }
}
class Frutilla extends Aderezo{

    @Override
    public void setNombre(String nombre) {
        super.nombre = nombre;
    }
}
class Crema extends Aderezo {
    @Override
    public  void setNombre(String nombre){
       super.nombre = nombre;
    }
}