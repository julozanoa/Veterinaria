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
public class Gato extends Mascota{

    protected boolean esCazador;

    public Gato(boolean esCazador, String id, String nombre, String colorPelo) {
        super(id, nombre, colorPelo);
        this.esCazador = esCazador;
    }
    
    
    @Override
    public String sonido() {
        return "Miau";
    }
    
}
