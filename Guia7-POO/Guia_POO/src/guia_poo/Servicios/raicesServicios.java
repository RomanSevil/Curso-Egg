/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Servicios;

import guia_poo.Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class raicesServicios {
    Scanner leer=new Scanner(System.in);
    public Raices ingresarCoeficientes(){
        int a,b,c;
        System.out.println("Ingrese el valor de A");
        a=leer.nextInt();
        System.out.println("Ingrese el valor de B");
        b=leer.nextInt();
        System.out.println("Ingrese el valor de C");
        c=leer.nextInt();
        
        Raices n1=new Raices(a, b, c);
        return n1;
    }
    
   public double getDiscriminante(Raices n1){
       double discriminante=Math.pow(n1.getB(),2)-(4*n1.getA()*n1.getC());
       return discriminante;
   }
   public boolean tieneRaices( double discriminante){
       boolean raices;
       if(discriminante>0){
           raices=true;
       }else{
           raices=false;
       }
       return raices;
   }
   
   public boolean tieneRaiz( double discriminante){
       boolean raiz;
       if(discriminante==0){
           raiz=true;
       }else{
           raiz=false;
       }
       return raiz;
   }
   
   public void obtenerRaices(double discriminante,Raices n1){
       double soluciones[]=new double[2];
       if(tieneRaices(discriminante)){
           soluciones[0]=((-n1.getB())+Math.sqrt(Math.pow(n1.getB(),2)-(4*n1.getA()*n1.getC())))/(2*n1.getA());
           soluciones[1]=((-n1.getB())-Math.sqrt(Math.pow(n1.getB(),2)-(4*n1.getA()*n1.getC())))/(2*n1.getA());
           
       }else{
           System.out.println("No se encontratron soluciones");
           
       }
       System.out.println("2 Posibles soluciones");
       for(int i=0;i<soluciones.length;i++){
           System.out.print(soluciones[i] + " ");
       }
   }
   
   public void obtenerRaiz(double discriminante,Raices n1){
       double solucion = 0;
       if(tieneRaiz(discriminante)){
           System.out.println("Solucion");
           solucion=((-n1.getB())-(4*n1.getA()*n1.getC()))/(2*n1.getA());
   
       }else{
           System.out.println("No se encontraron soluciones");
           
       }
       
       System.out.println("La solucion es " + solucion);
   }
   
   public void calcular(double discriminante,Raices n1){
       if(tieneRaices(discriminante)){
           obtenerRaices(discriminante, n1);
       }else if(tieneRaiz(discriminante)){
           obtenerRaiz(discriminante, n1);
       }else{
           System.out.println("No tiene solucion");
       }
   }
   
  
}
