/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import excepciones.Ej2Excepcion;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class serviciosEj2 {
    Scanner sc=new Scanner(System.in);
    int[] datos=new int[5];
    public void vector() throws Ej2Excepcion{
        System.out.println("Ingrese datos");
        try{
        for(int i=0;i<10;i++){
            
            if(i>datos.length-1){
                throw new  Ej2Excepcion("Fuera de rango");
            }
            datos[i]=sc.nextInt();
        }
        }catch(Ej2Excepcion e){
            throw e;
        }catch(Exception e){
            System.out.println("Tipo de dato incorrecto");
        }
        
    }
}
