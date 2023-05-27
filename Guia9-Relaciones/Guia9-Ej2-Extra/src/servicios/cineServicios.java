/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import entidades.Sala;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class cineServicios {

    //HashMap<Sala,String >salaEspectadores=new HashMap<>();
    private Sala[][] salaEspectador= new Sala[8][6];
    
    ArrayList<Espectador> espectadores = new ArrayList<>();
    Random r = new Random();
    Pelicula p1 = new Pelicula("Jurassic World:Dominion", 2, 13, "Colin Trevorrow");
    Cine c1 = new Cine(p1, 11);
    

    public void crearSala() {
        

        String letras = "ABCDEF";
        char letra;
        int f = 9;
        for (int i = 0; i < salaEspectador.length; i++) {
            f--;

            for (int j = 0; j < salaEspectador[i].length; j++) {

                letra=letras.charAt(j);
                salaEspectador[i][j] = new Sala(f, letra);

            }
        }
        c1.setSala(salaEspectador);

        /*
        letras=letras.substring(j, j + 1);
        letra.substring(j, j + 1)
        for(int i=0;i<salaEspectador.length;i++){
            for(int j=0;j<salaEspectador[i].length;j++){
                System.out.print(salaEspectador[i][j] + " ");
            }
            System.out.println(" ");
        }
         */
    }

    public void generarEspectadores() {
        String[] nombres = {"Roman", "Misael", "Marcus", "John", "Thomas", "Robert", "Anthony", "Paul", "Frank", "Tom", "Jim", "Leo", "Leandro", "Christian", "Denis", "Walter", "Gabriel", "Jonathan", "Ethan", "Luis", "Ciro", "Andrew", "Peter", "Tobey", "Fletcher", "Samuel", "Alexis", "Vladimir", "Javier", "Mateo", "Andres", "Simon", "David", "Arnold", "Martin", "Joe", "Donald", "Ronald", "George"};

        //System.out.println(nombres.length);
        for (int i = 0; i < nombres.length; i++) {
            espectadores.add(new Espectador(nombres[i], r.nextInt(35 - 8) + 8, r.nextInt(20 - 5) + 5));

        }

        /*for(Espectador cada:espectadores){
            System.out.println(cada.toString());
        }*/
    }

    public void crearCine() {
        //ArrayList<ArrayList<Sala>> salaEsp = new ArrayList<>();
        //Collections.addAll(salaEsp, salaEspectador);


        /*for (ArrayList<Sala> cada : salaEsp) {
            System.out.println(cada);
        }*/
        int k = 0;
        

        
        char letraRandom;
        int numRandom;
        
        for (Espectador espec : espectadores) {
            do{
                letraRandom = (char) (r.nextInt(5) + 'a');
                
                numRandom = r.nextInt(8 - 0) + 0;
                //System.out.println(numRandom);
            }while(!hayLugar(numRandom,letraRandom));
            if (puedeSentar(espec)) {
                sentar(numRandom, letraRandom, espec);
        
            }
        }

       
        for (int i = 0; i < salaEspectador.length; i++) {
            for (int j = 0; j < salaEspectador[i].length; j++) {
                System.out.print(salaEspectador[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public boolean puedeSentar(Espectador espectador) {
            return espectador.getDinero() >=c1.getPrecioEntrada()&&espectador.getEdad()>=p1.getEdadMinima();    
    }
    
    public boolean hayLugar(int fila,char letra){
        return getButaca(fila, letra).getEspectador()==null;
        
        /*for(int i=0;i<salaEspectador.length;i++){
            for(int j=0;j<salaEspectador[i].length;j++){
                if(salaEspectador[i][j].getEspectador()==null){
                    return true;
                }
            }
        }
        return false;
        */
    }
    
    public Sala getButaca(int fila,char letra){
//return salaEspectador[salaEspectador.length-fila-1][letra-'A'];
        int col=letra-'a';
        //System.out.println(col);
        return c1.getSala()[c1.getSala().length-fila-1][col];
    }
    
    public void sentar(int fila,char letra,Espectador e){
       getButaca(fila, letra).setEspectador(e);
        getButaca(fila, letra).setX("X");
   }

}

/*
new Espectador(nombres[i], r.nextInt(60-10)+10, r.nextInt(20-5)+5)

Espectador e1=new Espectador();
            e1.setNombre(nombres[i]);
            e1.setEdad(r.nextInt(60-8)+8);
            e1.setDinero(r.nextInt(20-5)+5);
            espectadores.add(e1);

for(int i=0;i<salaEspectador.length;i++){
            for(int j=0;j<salaEspectador[i].length;j++){
                for(Espectador espec:espectadores){
                    
                    if(espec.getDinero()>=c1.getPrecioEntrada() && espec.getEdad()>=p1.getEdadMinima()&&salaEspectador[i][j].getEspectador()==null){
                        System.out.println(espec);
                        salaEspectador[i][j].setEspectador(espec);
                        salaEspectador[i][j].setAsiento(salaEspectador[i][j].getAsiento().concat("X"));
                        break;
                    }
                }
            }
        }




for (ArrayList<Sala> fila : salaEsp) {
            for (Sala cada : fila) {
                for (Espectador espec : espectadores) {
                    
                    if (espec.getDinero() >= c1.getPrecioEntrada() && espec.getEdad() >= p1.getEdadMinima() && cada.getEspectador() == null) {
                        System.out.println(espec);
                        cada.setEspectador(espec);
                        cada.setAsiento(cada.getAsiento().concat("X"));
                        //break;
                    }

                    
                }
            }
        }



for (int i = 0; i < salaEspectador.length; i++) {
            ArrayList<Sala> cadaFila = new ArrayList<>();
            for (int j = 0; j < salaEspectador[i].length; j++) {

                cadaFila.add(salaEspectador[i][j]);
            }
            salaEsp.add(cadaFila);
        }

 */
