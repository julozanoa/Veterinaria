/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinesLogic;

/**
 *
 * @author Estudiante
 */
public abstract class Mascota {
    protected String id;
    protected String nombre;
    protected String colorPelo;

    public Mascota(String id, String nombre, String colorPelo) {
        this.id = id;
        this.nombre = nombre;
        this.colorPelo = colorPelo;
    }

    
public abstract String sonido();
    

}
