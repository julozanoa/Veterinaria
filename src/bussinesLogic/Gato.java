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

    public Gato(String id, String nombre, String colorPelo, boolean esCazador) {
        super(id, nombre, colorPelo);
        this.esCazador = esCazador;
    }
    
    
    @Override
    public String sonido() {
        return "Miau";
    }

    public boolean isEsCazador() {
        return esCazador;
    }

    public void setEsCazador(boolean esCazador) {
        this.esCazador = esCazador;
    }
    
}
