/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11.excepciones;

import entidades.DivisionNumero;
import entidades.Persona;
import excepciones.Ej2Excepcion;
import java.util.InputMismatchException;
import java.util.Scanner;
import servicios.personaServicios;
import servicios.serviciosEj2;
import servicios.serviciosEj3;

/**
 *
 * @author usuario
 */
public class Guia11Excepciones {

    /*public static void main(String[] args) {
        personaServicios ps=new personaServicios();
        Persona p1=null;
        
        try{
            ps.esMayorDeEdad(p1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/
    //Ejercicio 2
//    public static void main(String[] args) throws Ej2Excepcion{
//
//        serviciosEj2 s=new serviciosEj2();
//        int k=0;
//        try{
//               s.vector();
//               throw new Ej2Excepcion("Indice fuera de rango");
//         
//        }catch(Ej2Excepcion a){
//            System.out.println(a.getMessage());
//        }
//    }
    //Ejercicio 3
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        serviciosEj3 s = new serviciosEj3();
        String divisor, dividendo;

        try {
            dividendo = sc.next();
            divisor = sc.next();
            int num1 = Integer.parseInt(dividendo);
            int num2 = Integer.parseInt(divisor);

            s.division(num1, num2);
        } catch (NumberFormatException n) {
            System.out.println("El caracter no se pudo convertir a int");
        } catch (InputMismatchException e) {
            System.out.println("Tipo de dato ingresado incorrecto");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }*/
    //Ejercicio5
    /*public static void main(String[] args) {
        boolean encontro = false;
        Scanner sc = new Scanner(System.in);
        int adivinar, intentos = 0;
        int numero = (int) (Math.random() * 500);

        do {
            try {
                System.out.println("Ingrese el numero a adivinar");
                adivinar = sc.nextInt();
                intentos++;
                if (adivinar < numero) {
                    System.out.println("El numero que ingreso es menor al numero a adivinar");
                } else if (adivinar > numero) {
                    System.out.println("El numero que ingreso es mayor al numero a adivinar");
                } else if (adivinar == numero) {
                    encontro = true;
                }

            } catch (InputMismatchException e) {
                intentos++;
                sc.nextLine();
                System.out.println("Se introdujo un caracter invalido");

            }
        } while (!encontro);

        if (encontro) {
            System.out.println("Adivino el numero en " + intentos + " intentos");
        }
    }*/
    
    //Ejercicio6
    /*public static void main(String[] args) {
        System.out.println("Sentencia 1");
        System.out.println("Sentencia 2");
        
        try{
            System.out.println("Sentencia 3");
            System.out.println("Sentencia 4");
        }catch(Exception e){
            
        }
    }*/

}
/*

 */
