/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Servicios;

import guia_poo.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class cadenaServicios {

    private Scanner leer = new Scanner(System.in);
    
        Cadena palabra=new Cadena();
       
        
    public int mostrarVocales(Cadena palabra) {
        
        int nVocal = 0;
        int k=0;
        String frase=palabra.getFrase();
        
        String letra;
        for (int i = 0; i < frase.length() ; i++) {
            letra=frase.substring(k++,k);
            //System.out.println(letra);
            if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
                nVocal++;
            }
        }
        System.out.println(nVocal);
        return nVocal;
    }

    public void invertirFrase(Cadena palabra) {
        String frase = palabra.getFrase();
        char letra;
        String invertida = " ";
        
       
        //System.out.println(letra);
        //for (int i = frase.length()-1; i >= 0; i--) {
            //invertida=frase.substring(k,0);
            //System.out.println("Letra " + letra);
            //invertida += letra;
        //}
        
        for(int i=0;i<frase.length();i++){
            letra=frase.charAt(i);
            invertida=letra+invertida;
        }
        System.out.println("Frase invertida " + invertida);
    }

    public int vecesRepetido(String letra,Cadena palabra) {
        int cont = 0;
        int k=0;
        String fraseCompleta = palabra.getFrase();
        for (int i = 0; i < fraseCompleta.length(); i++) {
            
            if (letra.equalsIgnoreCase(fraseCompleta.substring(k++,k))) {
                cont++;
            }
        }
        return cont;
    }

    public boolean compararLongitud(String frase,Cadena palabra) {
        boolean log = false;
        int lon = palabra.getLongitud();
        int nuevaLongitud = frase.length();
        if (nuevaLongitud == lon) {
            log = true;
            return log;
        }
        return log;
    }

    public void unirFrases(String frase,Cadena palabra) {
        String fraseCompleta;
        fraseCompleta = palabra.getFrase().concat(frase);
        System.out.println("Frase resultante: " + fraseCompleta);
    }

    public void reemplazar(String letra,Cadena palabra) {
        String fraseCompleta = palabra.getFrase();
        String a;
        
        int k=0;
        for (int i = 0; i < fraseCompleta.length(); i++) {
            a = fraseCompleta.substring(k++,k);
            System.out.println(a);
            if (a.equalsIgnoreCase("a")) {
                
                fraseCompleta=fraseCompleta.replace(a, letra);
                
            }
        }
        System.out.println(fraseCompleta);
    }

    public boolean contiene(String letra,Cadena palabra) {
        boolean log = false;
        String fraseCompleta = palabra.getFrase();
        for (int i = 0; i < fraseCompleta.length(); i++) {
            if (fraseCompleta.substring(i).equalsIgnoreCase(letra)) {
                log = true;
                break;
            }
        }
        return log;
    }
}
