/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinesLogic;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Veterinaria {
    private ArrayList <Mascota> mascotas;

    public Veterinaria() {
        this.mascotas = new ArrayList<Mascota>();
    }
    
    
    public void removerMascota(Mascota m){
        for(Mascota p : mascotas){
            if(m.equals(p)){
                mascotas.remove(p);
                break;
            }
        }
    }
    
    public void mostrarMascotasPorTipo(String tipo){
        for (Mascota m : mascotas) {
            if(tipo.equals("perro") && m.getClass() == Perro.class){
                Perro p = (Perro)m;
                System.out.println("Perros:");
                System.out.println(p.getId()+" "+p.getNombre()+" "+p.getColorPelo()+" "+p.getRaza());
            }else if (tipo.equals("gato")&&m.getClass() == Gato.class){
                Gato p = (Gato)m;
                System.out.println("Gatoss:");
                System.out.println(p.getId()+" "+p.getNombre()+" "+p.getColorPelo()+" "+p.isEsCazador());
            }else if(tipo.equals("hamster")&&m.getClass() == Hamster.class){
                Hamster p = (Hamster)m;
                System.out.println("Hamsters:");
                System.out.println(p.getId()+" "+p.getNombre()+" "+p.getColorPelo()+" "+p.getPeso()); 
            }
        }
    }
    
    public void mostrarMascotas(){
        for (Mascota m : mascotas) {
            if(m.getClass() == Perro.class){
                Perro p = (Perro)m;
                System.out.println("Perros:");
                System.out.println(p.getId()+" "+p.getNombre()+" "+p.getColorPelo()+" "+p.getRaza());
            }else if (m.getClass() == Gato.class){
                Gato p = (Gato)m;
                System.out.println("Gatoss:");
                System.out.println(p.getId()+" "+p.getNombre()+" "+p.getColorPelo()+" "+p.isEsCazador());
            }else if(m.getClass() == Hamster.class){
                Hamster p = (Hamster)m;
                System.out.println("Perros:");
                System.out.println(p.getId()+" "+p.getNombre()+" "+p.getColorPelo()+" "+p.getPeso()); 
            }
        }
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    
}
