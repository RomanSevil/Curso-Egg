/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Servicios;

import guia_poo.Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ahorcadoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        boolean band;
        String palabra;
        do {
            band = true;

            System.out.println("Ingrese una palabra");
            palabra = leer.next();
            for (int i = 0; i < palabra.length(); i++) {
                if (Character.isLetter(palabra.charAt(i)) == false) {
                    System.out.println("Ingreso mal un caracter en la posicion " + i);
                    band = false;
                    break;
                }
            }
        } while (band == false);

        System.out.println("Ingrese el numero maximo de jugadas");
        int jugadas = leer.nextInt();

        String[] vector = new String[palabra.length()];

        int k = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = palabra.substring(k++, k);
        }
        /*for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "");
        }*/
        Ahorcado a1 = new Ahorcado();
        a1.setPalabra(vector);
        a1.setIntentos(jugadas);
        return a1;

    }

    public int longitud(Ahorcado a1) {
        int longitud = a1.getPalabra().length;
        return longitud;
    }

    public boolean buscar(String letra, Ahorcado a1) {
        boolean esta = false;
        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(a1.getPalabra()[i])) {
                esta = true;
                break;
            }
        }
        return esta;
    }

    public boolean encontradas(String letra, Ahorcado a1, String[] letrasEncontradas) {
        int encontradas = a1.getLetrasEncontradas();

        String vector[] = a1.getPalabra();

        int faltantes = vector.length - encontradas;
        boolean esta = false;

        for (int i = 0; i < vector.length; i++) {

            if (letra.equalsIgnoreCase(vector[i]) && !vector[i].equalsIgnoreCase(letrasEncontradas[i])) { //comprueba que la letra no este repetida

                esta = true;
                letrasEncontradas[i] = letra;
                faltantes--;
                encontradas++;
            }
        }

        a1.setLetrasEncontradas(encontradas);
        System.out.println("Numero de letras (encontradas,faltantes): " + "(" + a1.getLetrasEncontradas() + "," + faltantes + ")");
        for (int i = 0; i < letrasEncontradas.length; i++) {
            System.out.print(letrasEncontradas[i] + " ");
        }
        System.out.println(" ");

        return esta;
    }

    public void juego(Ahorcado a1) {
        String[] letrasEncontradas = new String[a1.getPalabra().length];

        String letra;
        for (int i = 0; i < letrasEncontradas.length; i++) {
            letrasEncontradas[i] = "_";
        }
        int intentos = a1.getIntentos();

        do {

            do {
                System.out.println("Ingrese una letra:");
                letra = leer.next();
                System.out.println("Ingreso un caracter invalido");

            } while (letra.length() != 1 || !Character.isLetter(letra.charAt(0)));

            System.out.println("Longitud de la palabra: " + longitud(a1));
            if (buscar(letra, a1)) {
                System.out.println("Mensaje: La letra pertenece a la palabra");
            } else {
                System.out.println("Mensaje: La letra no pertenece  a la palabra");
            }

            if (!encontradas(letra, a1, letrasEncontradas)) {
                intentos--;
                a1.setIntentos(intentos);
            }

            if (a1.getIntentos() > 0) {
                System.out.println("Numero de oportunidades restantes " + a1.getIntentos());
            } else {
                System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
            }
            System.out.print("---------------------------------------------------");
            System.out.println(" ");
        } while (a1.getIntentos() > 0 && a1.getLetrasEncontradas() != a1.getPalabra().length);
        if (a1.getLetrasEncontradas() == a1.getPalabra().length) {
            System.out.println("Felicitaciones! Has ganado");
        }

    }
}
