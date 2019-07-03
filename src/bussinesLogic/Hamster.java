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
public class Hamster extends Mascota{

    protected double peso;
    
    public Hamster(double peso, String id, String nombre, String colorPelo) {
        super(id, nombre, colorPelo);
        this.peso = peso;
    }
    @Override
    public String sonido() {
        return "";
    }
    
}
