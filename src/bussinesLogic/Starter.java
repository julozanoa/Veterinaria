/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinesLogic;
import java.util.*;
import java.io.*;

/**
 *
 * @author Estudiante
 */
public class Starter {
    
    private ArrayList <Persona> personas;
    private Veterinaria veterinaria;

    public Starter(Veterinaria veterinaria) {
        this.personas = new ArrayList<Persona>();
        this.veterinaria = veterinaria;
    }
    
    
    public void leerMascotas(Veterinaria V){
        
    }
    
    public void manejarVeterinaria(Veterinaria v,String acción){
        
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public Veterinaria getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    
    
    public static void main(String[] args) {
        Veterinaria v = new Veterinaria();
        Starter s = new Starter(v);
        File f = new File("pets.txt");
        
        if (f.exists()) {
            try{
                Scanner input = new Scanner(f);
                String[] Palabras;
                
                for (int i = 0; i < 2; i++) {
                    Palabras = input.nextLine().split(" ");
                    if(Palabras[0].equals("Dog")){
                        String a = Palabras[1];
                        String b = Palabras[2];
                        String c = Palabras[3];
                        String d = Palabras[4];
                        Perro p1 = new Perro(a,b,c,d);
                        v.getMascotas().add(p1);
                        String n = input.next();
                        String id = input.next();
                        for (int j = 0; j < s.personas.size(); j++) {
                        }
                    }
                }
                
            }catch(FileNotFoundException ex){
                
            }
        
        }
    }
    
    
}
