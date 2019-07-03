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
public class Perro extends Mascota{

    protected String raza;

    public Perro(String id, String nombre, String colorPelo, String raza) {
        super(id, nombre, colorPelo);
        this.raza = raza;
    }

    
    
    @Override
    public String sonido() {
        return "Guau";
    }
    
}
