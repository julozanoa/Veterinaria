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
    
    
    public String leerMascotas(Veterinaria v, String id)throws IllegalArgumentException{
        for (int i = 0; i < v.getMascotas().size(); i++) {
            if (id.equals(v.getMascotas().get(i).getId())) {
                throw new IllegalArgumentException("error");
            }else{
                
            }
        }return "1";
    }
    
    public String leerPersonas(String id){
        for (int i = 0; i < personas.size(); i++) {
            if (id.equals(personas.get(i).getId())) {
                return "0";
            }else{
            }
        }return "1";
    }
    
    public void manejarVeterinaria(Veterinaria v,String acción, String id, String tipo){
        if(acción.equals("remover")){
            for (Persona p : personas) {
                for (Mascota m : p.getMascotas()) {
                    if(id.equals(m.getId())){
                        v.removerMascota(m);
                        p.getMascotas().remove(m);
                        break;
                    }
                }
            }
        }else if(acción.equals("mostrarportipo")){
            v.mostrarMascotasPorTipo(tipo);
        }
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
        Scanner sc = new Scanner(System.in);
        Veterinaria v = new Veterinaria();
        Starter s = new Starter(v);
        File f = new File("pets.txt");
        
        if (f.exists()) {
            try{
                Scanner input = new Scanner(f);
                String[] Palabras;
                
                while(input.hasNextLine()){
                    for (int i = 0; i < 2; i++) {
                    Palabras = input.nextLine().split(" ");
                    if(Palabras[0].equals("Dog")){
                        
                        String idp = Palabras[1];
                        String nmp = Palabras[2];
                        String pp = Palabras[3];
                        String rp = Palabras[4];
                        try{
                            if("1".equals(s.leerMascotas(v, idp))){
                                v.getMascotas().add(new Perro(idp,nmp,pp,rp));
                            }
                            String nombredueñop = input.next();
                            String iddueñop = input.next();
                            Persona p = null;
                            for (int j = 0; j < s.personas.size(); j++) {
                                if(iddueñop.equals(s.personas.get(j).getId())){
                                    p = s.personas.get(j);
                                }
                            }
                            if(p == null){
                                p = new Persona(nombredueñop,iddueñop);
                                s.personas.add(p);
                            }
                            p.getMascotas().add(new Perro(idp,nmp,pp,rp));
                                
                        }catch(IllegalArgumentException ex){
                            System.out.println("Este id ya existe, no se añadio a "+nmp);
                        }
                        
                    }else if(Palabras[0].equals("Cat")){
                        
                        String idg = Palabras[1];
                        String nmg = Palabras[2];
                        String pg = Palabras[3];
                        String ecg0 = Palabras[4];
                        boolean ecg = true;
                        if(ecg0.equals("true")){
                            ecg = true;
                        }else if(ecg0.equals("false")){
                            ecg = false;                        
                        }
                        try{
                            if("1".equals(s.leerMascotas(v, idg))){
                                v.getMascotas().add(new Gato(idg,nmg,pg,ecg));
                            }
                            String nombredueñog = input.next();
                            String iddueñog = input.next();
                            Persona p = null;
                            for (int j = 0; j < s.personas.size(); j++) {
                                if(iddueñog.equals(s.personas.get(j).getId())){
                                    p = s.personas.get(j);
                                }
                            }
                            if(p == null){
                                p = new Persona(nombredueñog,iddueñog);
                                s.personas.add(p);
                            }
                            p.getMascotas().add(new Gato(idg,nmg,pg,ecg));
                        }catch(IllegalArgumentException ex){
                            System.out.println("Este id ya existe, no se añadio a "+nmg);
                        }
                    }else if(Palabras[0].equals("Hamster")){
                        
                        String idh = Palabras[1];
                        String nmh = Palabras[2];
                        String ph = Palabras[3];
                        String thS = Palabras[4];
                        double th = Double.parseDouble(thS);
                        
                        try{
                            if("1".equals(s.leerMascotas(v, idh))){
                                v.getMascotas().add(new Hamster(idh,nmh,ph,th));
                            }
                            String nombredueñoh = input.next();
                            String iddueñoh = input.next();
                            Persona p = null;
                            for (int j = 0; j < s.personas.size(); j++) {
                                if(iddueñoh.equals(s.personas.get(j).getId())){
                                    p = s.personas.get(j);
                                }
                            }
                            if(p == null){
                                p = new Persona(nombredueñoh,iddueñoh);
                                s.personas.add(p);
                            }
                            p.getMascotas().add(new Hamster(idh,nmh,ph,th));
                        }catch(IllegalArgumentException ex){
                            System.out.println("Este id ya existe, no se añadio a "+nmh);
                        }
                    }
                    }
                }
                while(true){
                    System.out.println("1 para remover mascota");
                    System.out.println("2 para listar mascotas por tipo");
                    System.out.println("presione cualquier otra tecla para salir");
                    String opcion = sc.nextLine();

                    if(opcion.equals("1")){
                        System.out.println("Ingrese id de la mascota a remover");
                        String id = sc.nextLine();
                        s.manejarVeterinaria(v,"remover",id,"");
                    }else if(opcion.equals("2")){
                        System.out.println("Inrese el tipo de Mascota");
                        String tipo = sc.nextLine();
                        s.manejarVeterinaria(v,"mostrarportipo","", tipo);
                    }else{
                        break;
                    }
                }
                File archivosalida = f;
                    PrintStream salida = null;
                    if (!archivosalida.exists()) 
                          try {
                              archivosalida.createNewFile();
                  } catch (IOException ex) {
                              System.out.println("ECXEPCION");
                  }
                        
                        try{
                          
                            salida = new PrintStream (archivosalida);
                            for(Persona p : s.getPersonas()){
                                for (Mascota m : p.getMascotas()) {
                                if (m.getClass() == Gato.class) {
                                    Gato g = (Gato)m;
                                    salida.println("Cat"+" "+g.getId()+" "+g.getNombre()+" "+g.getColorPelo()+" "+g.isEsCazador());
                                }else if(m.getClass() == Hamster.class){
                                    Hamster h = (Hamster)m;
                                    salida.println("Hamster"+" "+h.getId()+" "+h.getNombre()+" "+h.getColorPelo()+" "+h.getPeso());
                                }else if(m.getClass() == Perro.class){
                                    Perro pr = (Perro)m;
                                    salida.println("Dog"+" "+pr.getId()+" "+pr.getNombre()+" "+pr.getColorPelo()+" "+pr.getRaza());
                                }
                                    salida.println(p.getNombre()+" "+p.getId());
                            }
                            }
                            salida.flush();
                            salida.close();
                            
                        }catch (IOException ss){
                            System.out.println("excepcion");
                        
            }
            }catch(FileNotFoundException ex){
                
            }
            
        }
    }
    
    
}
