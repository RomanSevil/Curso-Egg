/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Baraja;
import entidades.Carta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class cartasServicios {
    
    //Carta c1 = new Carta();
    Scanner sc = new Scanner(System.in);

    public Baraja crearCarta() {

        ArrayList<Carta> cartas = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                if (j != 8 && j != 9) {

                    switch (i) {
                        case 0:
                            cartas.add(new Carta(j, "Espadas"));
                            break;
                        case 1:
                            cartas.add(new Carta(j, "Bastos"));
                            break;
                        case 2:
                            cartas.add(new Carta(j, "Oros"));
                            break;
                        case 3:
                            cartas.add(new Carta(j, "Copas"));
                            break;
                    }
                }
            }
            
            
        }

        /*for (Carta cada : cartas) {
            System.out.println(cada.toString());
        }*/
        System.out.println(cartas.size());
        return new Baraja(cartas);
    }

    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getBaraja());

        for (Carta cada : baraja.getBaraja()) {
            System.out.println(cada.toString());
        }
    }

    public void siguienteCarta(Baraja baraja,ArrayList<Carta>cartasJugadas) {
        
        if (baraja.getBaraja().isEmpty()) {
            System.out.println("El mazo no tiene cartas");
        } else {
            System.out.println("Siguiente carta " + baraja.getBaraja().get(0));
            cartasJugadas.add(baraja.getBaraja().get(0));
            baraja.getBaraja().remove(0);
            
            if (baraja.getBaraja().isEmpty()) {
                System.out.println("El mazo ya no tiene cartas");
            }
        }
        
    }

    public void cartasDisponibles(Baraja baraja) {
        System.out.println("Quedan " + baraja.getBaraja().size() + " cartas para repartir");
    }

    public void darCartas(Baraja baraja) {
        ArrayList<Carta>cartasJugadas=new ArrayList<>();
        System.out.println("Ingrese un numero de cartas");
        int n = sc.nextInt();

        if (n > baraja.getBaraja().size()) {
            System.out.println("El numero de cartas que pidio es mayor a la cantidad de cartas");
        } else {
            for (int i = 0; i < n; i++) {
                siguienteCarta(baraja,cartasJugadas);
            }
        }
        cartasMonton(baraja, cartasJugadas);
    }
    
    
    public void cartasMonton(Baraja baraja,ArrayList<Carta> cartasJugadas){
        
        System.out.println("Se jugaron " + cartasJugadas.size()+" cartas");
        System.out.println("Cartas jugadas " + cartasJugadas);
        
    }
    
    public void mostrarBaraja(Baraja baraja){
        System.out.println(baraja.getBaraja());
        cartasDisponibles(baraja);
    }
}

    /*
cartasJugadas.add(baraja.getBaraja().get(0));

public void cartasMonton(Baraja baraja) {
        Baraja barajaLlena = crearCarta();

        List<Carta>mazoLleno=barajaLlena.getBaraja();
        List<Carta> mazoActual = baraja.getBaraja();
        System.out.println(mazoActual.size());

       mazoLleno.removeIf(mazoActual::contains);
        //barajaLlena.getBaraja().removeIf(mazoActual::contains);
        
        
        //System.out.println("Hasta ahora se jugaron " + barajaLlena.getBaraja().size() + " cartas");
        System.out.println("Hasta ahora se jugaron " + mazoLleno.size() + " cartas");
        System.out.println(mazoActual.size());

    }

}*/

/*

barajaLlena.getBaraja().removeIf(mazoActual::contains);
c1.setPalo("Espadas");
c1.setPalo("Bastos");
c1.setPalo("Oros");
c1.setPalo("Copas");

c1.setNumero(j);
                    cartas.add(c1);
                    System.out.println(c1.getNumero());
for (Carta carta : mazoActual) {
            if (barajaLlena.getBaraja().contains(carta)) {
                barajaLlena.getBaraja().remove(carta);
                System.out.println("Jugada " + carta);
            }
        }

barajaLlena.getBaraja().removeAll(mazoActual);
        mazoActual.removeAll(barajaLlena.getBaraja());
//System.out.println("Cartas jugadas " + barajaLlena.getBaraja() );
if(mazoActual.containsAll(barajaLlena.getBaraja())){
            barajaLlena.getBaraja().removeAll(mazoActual);
        }
 barajaLlena.getBaraja().removeIf(mazoActual.con);
        for(Carta carta:barajaLlena.getBaraja()){
        for(Carta carta:mazoActual){
            if(mazoActual.contains(carta)){
                barajaLlena.getBaraja().remove(carta);
                System.out.println("Carta jugada " + barajaLlena.getBaraja());
            }
        
        }
        
        if(barajaLlena.getBaraja().containsAll(mazoActual)){
            barajaLlena.getBaraja().removeAll(mazoActual);
        }
 */
