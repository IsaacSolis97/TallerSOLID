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
    public Aderezo(){
        this.nombre = "";
    }
    
    @Override
    public String toString(){
        return this.nombre.toUpperCase();
    }
    public abstract void setNombre(String nombre);
}


