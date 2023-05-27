/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.herencia.ej2extra;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Guia10HerenciaEj2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Edificio> edificios = new ArrayList<>();

        int a = 0, t = 0;
        System.out.println("Ingrese cuantos edificios desea agregar ");
        int n = sc.nextInt();
        String opc;
        for (int i = 0; i < n; i++) {
            System.out.println("Seleccione el tipo de edificio ");
            opc = sc.next();
            if (opc.equalsIgnoreCase("oficinas")) {
                EdificioDeOficinas of = new EdificioDeOficinas();
                System.out.println("Ingrese el alto del edificio");
                of.setAlto(sc.nextInt());
                System.out.println("Ingrese el ancho del edificio");
                of.setAncho(sc.nextInt());
                System.out.println("Ingrese el largo del edificio");
                of.setLargo(sc.nextInt());
                System.out.println("Ingrese el numero de oficinas");
                of.setNumeroOficinas(sc.nextInt());
                of.setNumeroPisos(of.getNumeroOficinas());
                System.out.println("Ingrese la cantidad de personas por oficina");
                of.setCantidadPersonasOficina(sc.nextInt());
                of.calcularSuperficie();
                of.calcularVolumen();

                edificios.add(of);
            } else if (opc.equalsIgnoreCase("polideportivo")) {
                Polideportivo p1 = new Polideportivo();
                System.out.println("Ingrese el alto del polideportivo");
                p1.setAlto(sc.nextInt());
                System.out.println("Ingrese el ancho del polideportivo");
                p1.setAncho(sc.nextInt());
                System.out.println("Ingrese el largo del polideportivo");
                p1.setLargo(sc.nextInt());
                System.out.println("Ingrese el nombre del polideportivo");
                p1.setNombre(sc.next());
                System.out.println("¿El polideportivo esta techado?");
                String opcion = sc.next();
                if (opcion.equalsIgnoreCase("si")) {
                    p1.setTechado(true);
                } else {
                    p1.setTechado(false);
                }
                p1.calcularSuperficie();
                p1.calcularVolumen();

                edificios.add(p1);
            }
        }

        System.out.println("Superficie y volumen de cada edificio ");
        for (Edificio aux : edificios) {
            System.out.println("Superficie " + aux.getSuperficie() + " Volumen " + aux.getVolumen());
            if (aux instanceof EdificioDeOficinas) {
                EdificioDeOficinas object = (EdificioDeOficinas) aux;
                ((EdificioDeOficinas) aux).cantPersonas();

            }

            if (aux instanceof Polideportivo) {
                Polideportivo object = (Polideportivo) aux;
                if (((Polideportivo) aux).isTechado()) {
                    t++;
                } else {
                    a++;
                }

            }
        }

        System.out.println("Hay " + a + " polideportivos abiertos");
        System.out.println("Hay " + t + " polideportivos techados");

    }

}
