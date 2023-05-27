/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Perro;
import entidades.Persona;
import enumeraciones.razaPerro;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class serviciosAdopcion {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Persona> personas = new ArrayList<>();
    ArrayList<Perro> perros = new ArrayList<>();

    public void generarEntidades() {
        //Random generate = new Random();
        String[] nPersona = {"Roman", "Marcus", "John", "Anthony", "Paul", "Robert", "Tom", "Fletcher", "Louis", "Rick"};
        String[] nPerros = {"Chispy", "Nino", "Lola", "Max", "Lagartito", "Laika", "Polo", "Leon", "Ciro", "Zowi"};

        //String[] nombrePersona = new String[nPersona.length];
        for (int i = 0; i < nPersona.length; i++) {

            Persona dueño = new Persona();
            Perro p1 = new Perro();
            String nombre = nPerros[i];

            String nombrePersona = nPersona[i];
            dueño.setNombre(nombrePersona);
            p1.setNombre(nombre);
            p1.setRaza(razaPerro.randomRazas());
            //dueño.setPerro(new Perro(nombre, razaPerro.randomRazas()));
            personas.add(dueño);
            perros.add(p1);

        }

        Collections.shuffle(personas);
        Collections.shuffle(perros);

        adoptar();

    }

    public void adoptar() {

        String opc;
        int k = 0;
        do {
            for (Persona persona : personas) {
                if (persona.getPerro() == null) {
                    System.out.println(persona.getNombre() + " Elige un perro");
                    opc = sc.next();
                    for (Perro perro : perros) {
                        if (opc.equalsIgnoreCase(perro.getNombre()) && persona.getPerro() == null) {

                            System.out.println(persona.getNombre() + " adopto a " + perro.getNombre());
                            persona.setPerro(perro);
                            perros.remove(perro);
                            k++;
                            //adopciones.add(persona);
                            break;
                        }

                    }

                }

            }
        } while (k < personas.size());

        for (Persona cada : personas) {

            System.out.println(cada.toString());
        }

    }

}

/*
 razaPerro Raza=razas[generate.nextInt(razas.length)];

for(int i=0;i<nPersona.length;i++){
            nombrePersona[i]=nPersona[generate.nextInt(nPersona.length)];
            Persona dueño=new Persona();
            while(nombrePersona[i].equals(nPerros[i])){
                nombrePersona[i]=nPersona[generate.nextInt(nPersona.length)];
                System.out.println("Repetido " + nombrePersona[i]);
            }
            dueño.setNombre(nombrePersona[i]);
            personas.add(dueño);
        }


for (int i = 0; i < nPersona.length; i++) {
            
            Persona dueño = new Persona();
            for(int j=0;j<nombrePersona.length;j++){
                nombrePersona[i] = nPersona[generate.nextInt(nPersona.length)];
            while (nombrePersona[i].equals(nPersona[j])) {
                System.out.println("Repetido " + nombrePersona[i]);
                nombrePersona[i] = nPersona[generate.nextInt(nPersona.length)];

            }
            }
            dueño.setNombre(nombrePersona[i]);
            personas.add(dueño);
        }
/*for (int i = 0; i < nPerros.length; i++) {
            //String nombre = nPerros[generate.nextInt(nPerros.length)];

            Perro p1 = new Perro();
            p1.setNombre(nombre);
            // p1.setRaza(razaPerro.BEAGLE);
            p1.setRaza(razaPerro.randomRazas());
            perros.add(p1);

        }

/*if(!existe){
                        System.out.println("El perro elegido no existe");
                    
                    
                }*/
 /*if (persona.getPerro() == null) {
                    System.out.println("El perro que eligio " + persona.getNombre()+" no existe o fue adoptado");
                    System.out.println("Elige otro perro ");
                    opc=sc.next();
                }




for (Perro perro : perros) {

                    if (opc.equalsIgnoreCase(perro.getNombre())) {
                        existe = true;
                        System.out.println(persona.getNombre() + " adopto a " + perro.getNombre());
                        persona.setPerro(perro);
                        perros.remove(perro);

                        adopciones.add(persona);
                        
                        //k++;
                        //System.out.println(k); && persona.getPerro()==null
                        break;
                    }

                }



if (existe) {
                        while (itPersona.hasNext()) {
                            if (itPersona.next().getPerro() != null) {
                                System.out.println("Eliminado "+itPersona.next() );
                                itPersona.remove();
                                
                            }
                        }
                    }
 */
