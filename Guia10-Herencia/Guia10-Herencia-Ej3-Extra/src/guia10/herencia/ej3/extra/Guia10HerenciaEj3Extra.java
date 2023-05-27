/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.herencia.ej3.extra;

import static comparators.comparator.comparaPrecios;
import entidades.AlojamientoExtra;
import entidades.Camping;
import entidades.Hotel;
import entidades.Hotel4Estrellas;
import entidades.Hotel5Estrellas;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Guia10HerenciaEj3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hotel> hoteles = new ArrayList<>();
        ArrayList<AlojamientoExtra> alojamientosExtra = new ArrayList<>();
        int n;
        int opc;

        System.out.println("Ingrese cuantos hoteles o alojamientos extras desea agregar?");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el tipo de hotel o alojamiento que desee agregar");
            System.out.println("1.Hotel 4 estrellas \n 2.Hotel 5 estrellas \n 3.Camping \n 4.Residencia");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Hotel4Estrellas h4 = new Hotel4Estrellas();
                    h4.crearHotel4Estrellas();
                    hoteles.add(h4);
                    break;
                case 2:
                    Hotel5Estrellas h5 = new Hotel5Estrellas();
                    h5.crearHotel5Estrellas();
                    hoteles.add(h5);
                    break;
                case 3:
                    Camping c1 = new Camping();
                    c1.crearCamping();
                    alojamientosExtra.add(c1);
                    break;
                case 4:
                    Residencia r1 = new Residencia();
                    r1.crearResidencia();
                    alojamientosExtra.add(r1);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

        boolean salir = false;
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1.Todos los alojamientos\n2.Hoteles de mas caro a mas barato\n3.Camping con restaurante\n4.Residencias con descuentos\n5.Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    for (Hotel hotel : hoteles) {
                        System.out.println(hotel.toString());
                    }
                    for (AlojamientoExtra aux : alojamientosExtra) {
                        System.out.println(aux.toString());
                    }
                    break;
                case 2:
                    hoteles.sort(comparaPrecios);
                    for (Hotel hotel : hoteles) {
                        System.out.println(hotel.toString());
                    }
                    break;
                case 3:
                    for (AlojamientoExtra aux : alojamientosExtra) {
                        if (aux instanceof Camping) {
                            Camping object = (Camping) aux;
                            if (((Camping) aux).isRestaurant()) {
                                System.out.println(aux.toString());
                            }
                        }
                    }
                    break;
                case 4:
                    for (AlojamientoExtra aux : alojamientosExtra) {
                        if (aux instanceof Residencia) {
                            Residencia object = (Residencia) aux;
                            if (((Residencia) aux).isDescuentos()) {
                                System.out.println(aux.toString());
                            }
                        }
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (salir == false);
    }

}
