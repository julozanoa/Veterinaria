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
    
    public Hamster(String id, String nombre, String colorPelo, double peso) {
        super(id, nombre, colorPelo);
        this.peso = peso;
    }
    @Override
    public String sonido() {
        return "";
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
