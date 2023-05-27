/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Servicios;

import guia_poo.Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class nifServicios {
    Scanner leer=new Scanner(System.in);
    public NIF crearNif(){
        long resto;
        String letra="";
        String[] array=new String[23];
        array[0]="T";
        array[1]="R";
        array[2]="W";
        array[3]="A";
        array[4]="G";
        array[5]="M";
        array[6]="Y";
        array[7]="F";
        array[8]="P";
        array[9]="D";
        array[10]="X";
        array[11]="B";
        array[12]="N";
        array[13]="J";
        array[14]="Z";
        array[15]="S";
        array[16]="Q";
        array[17]="V";
        array[18]="H";
        array[19]="L";
        array[20]="C";
        array[21]="K";
        array[22]="E";
   
        NIF n1=new NIF();
        System.out.println("Ingrese su DNI");
        n1.setDNI(leer.nextLong());
        
        resto=((long) (n1.getDNI()))%23;
        //System.out.println(resto);
        for(int i=0;i<array.length;i++){
            if(i==resto){
                letra=array[i];
                break;
            }
        }
        
        //System.out.println(letra);
        
        n1.setLetra(letra);
        
        return n1;
    }
    
    public void mostrar(NIF n1){
        System.out.println(n1.getDNI()+ "-"+n1.getLetra());
    }
    
}
