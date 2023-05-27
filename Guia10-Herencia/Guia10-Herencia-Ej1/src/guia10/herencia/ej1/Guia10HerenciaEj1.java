/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.herencia.ej1;

import entidades.Alquiler;
import entidades.BarcoMotor;
import entidades.Embarcacion;
import entidades.Velero;
import entidades.Yate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Guia10HerenciaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alquiler a1 = new Alquiler();
        Scanner sc = new Scanner(System.in);

        ArrayList<Embarcacion> puerto = new ArrayList<>();
        puerto.add(new Yate(4, 1000, 845454646, 32, 2013));
        puerto.add(new BarcoMotor(1450, 79327424, 64, 1994));
        puerto.add(new Velero(2, 48465847, 36, 1997));
        puerto.add(new Yate(5, 1300, 8758466, 52, 2016));
        puerto.add(new Velero(3, 123477, 46, 2007));
        puerto.add(new BarcoMotor(1200, 95324324, 54, 2014));

        //System.out.println("1. Barco a motor 2.Velero 3.Yate");
        int i = 0;

        System.out.println("Barcos disponibles:");
        for (Embarcacion barco : puerto) {
            i++;
            System.out.println(i + "-" + barco.toString());
        }
        System.out.println("Seleccione el barco a alquilar");
        int opc = sc.nextInt();
        //int precio;
        for (Embarcacion barco : puerto) {
            if (puerto.indexOf(barco) + 1 == opc) {
                if (barco instanceof BarcoMotor) {
                    BarcoMotor object = (BarcoMotor) barco;
                    System.out.println("Usted eligio " + barco);
                    a1.crearAlquiler(barco);
                    ((BarcoMotor) barco).calcularPrecioMotor(a1);
                    System.out.println("El precio a pagar por el barco motor es " + a1.getPrecio());
                    continue;
                }
                if (barco instanceof Velero) {
                    Velero object = (Velero) barco;
                    System.out.println("Usted eligio " + barco);
                    a1.crearAlquiler(barco);
                    ((Velero) barco).calcularPrecioVelero(a1);
                     System.out.println("El precio a pagar por el velero es " + a1.getPrecio());
                    continue;
                }
                if (barco instanceof Yate) {
                    Yate object = (Yate) barco;
                    System.out.println("Usted eligio " + barco);
                    a1.crearAlquiler(barco);
                    ((Yate) barco).calcularPrecioYate(a1);
                     System.out.println("El precio a pagar por el yate es " + a1.getPrecio());
                    continue;
                }
            }

        }
        
        

    }
}
/*switch(opc){
            case 1:
                //a1.calcularAlquiler();
                break;
            case 2:
                
                break;
            case 3:
                break;
        
        if(puerto.indexOf(barco)+1==opc){
        
            }
        System.out.println("Usted eligio " + barco);
                a1.crearAlquiler(barco);
        
        
        }
 */
