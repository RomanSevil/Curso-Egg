/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Servicios;

import guia_poo.Entidades.sopaLetras;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class sopaLetrasServicios {
    Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    public sopaLetras crearSopa(){
        sopaLetras sopa1=new sopaLetras();
        String palabraSopa;
        String[][]matriz=new String[10][10];
        palabraSopa="PERROAROMASUFREPAPELHOJASHECHOPOLEAARMASGESTOLAPIZEXITORESMAREMARSALTOSALUDMARCOPLACACASASBAJASSALIR";
        int k=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=palabraSopa.substring(k, k+1);
                k++;
            }
        }
        sopa1.setPalabra(palabraSopa);
        sopa1.setMatriz(matriz);
        return sopa1;
    }
    
    public void imprimirSopa(sopaLetras sopa){
        for(int i=0;i<sopa.getMatriz().length;i++){
            for(int j=0;j<sopa.getMatriz().length;j++){
                System.out.print(sopa.getMatriz()[i][j] + " ");
            }
            System.out.println(" ");
    }
    }
    
    public void buscarPalabra(sopaLetras sopa){
        String[][] matriz=sopa.getMatriz();
        boolean esta;
        String buscar;
        System.out.println("Ingrese un palabra a buscar");
        buscar=sc.next();
        int kLetras=0;
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                esta=false;
                if(buscar.substring(0,1).equalsIgnoreCase(matriz[i][j])&&(j==0||j==5)){
                    kLetras=1;
                    for(int h=1;h<5;h++){
                        if(buscar.substring(h,h+1).equalsIgnoreCase(matriz[i][j+h])){
                            kLetras++;
                        }
                    }
                    if(kLetras==5){
                        System.out.println("La palabra esta en la fila " + i + " y columna " + j);
                        esta=true;
                        break;
                    }
                }
            }
            
    }
        
    }
}
