/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.IronArmadura;
import entidades.IronBota;
import entidades.IronCasco;
import entidades.IronGuante;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class IronManServicios {

    IronArmadura armadura;
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void crearArmadura() {
        IronBota botaIz = new IronBota();
        IronGuante guanteIzq = new IronGuante();
        IronBota botaDer = new IronBota();
        IronGuante guanteDer = new IronGuante();
        IronCasco casco = new IronCasco();

        System.out.println("Ingrese el color primario de su armadura");
        String color1 = sc.next();
        System.out.println("Ingrese el color secundario de su armadura");
        String color2 = sc.next();

        armadura = new IronArmadura(botaIz, botaDer, guanteIzq, guanteDer, casco, color1, color2, 0);
        System.out.println(armadura);
    }

    public void caminar() {
        int danio=Danio();
        int tiempoCamina = 0;
        System.out.println("Cuanto tiempo va a caminar(en minutos)?");
        try {
            tiempoCamina = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero entero positivo");
            sc.next();
            caminar();
        }

        int energiaRestada = (int) (tiempoCamina * 0.16);

        if (energiaRestada > armadura.getBotaDer().getPropulsor()) {
            System.out.println("No tiene energia suficiente");
            caminar();
        } else {
            armadura.getBotaDer().setSalud((armadura.getBotaDer().getSalud()-danio));
            armadura.getBotaIzq().setSalud((armadura.getBotaIzq().getSalud()-danio));
            armadura.getBotaDer().setPropulsor(armadura.getBotaDer().getPropulsor() - energiaRestada);
            armadura.getBotaIzq().setPropulsor(armadura.getBotaIzq().getPropulsor() - energiaRestada);
            System.out.println("Energia restante " + armadura.getBotaDer() + " " + armadura.getBotaIzq());
        }

        
    }

    public void correr() {
        int danio=Danio();
        int tiempoCorre = 0;
        System.out.println("Cuanto tiempo va a correr(en minutos)?");
        try {
            tiempoCorre = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero entero positivo");
            sc.next();
            correr();
        }

        int energiaRestada = (int) (tiempoCorre * 0.32);

        if (energiaRestada > armadura.getBotaDer().getPropulsor()) {
            System.out.println("No tiene energia suficiente");
            correr();
        } else {
            armadura.setBateria(armadura.getBateria()-energiaRestada*2);
            armadura.getBotaDer().setPropulsor(armadura.getBotaDer().getPropulsor() - energiaRestada);
            armadura.getBotaIzq().setPropulsor(armadura.getBotaIzq().getPropulsor() - energiaRestada);
            System.out.println("Energia restante " + armadura.getBotaDer() + " " + armadura.getBotaIzq());
        }

        
    }
    
    public void propulsion(){
        int danio=Danio();
        int tiempoPropulsion = 0;
        System.out.println("Cuanto tiempo va a propulsionar(en minutos)?");
        try {
            tiempoPropulsion = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero entero positivo");
            sc.next();
            propulsion();
        }

        int energiaRestada = (int) (tiempoPropulsion * 0.48);

        if (energiaRestada > armadura.getBotaDer().getPropulsor()) {
            System.out.println("No tiene energia suficiente");
            propulsion();
        } else {
            armadura.getBotaDer().setSalud((armadura.getBotaDer().getSalud()-danio));
            armadura.getBotaIzq().setSalud((armadura.getBotaIzq().getSalud()-danio));
            armadura.setBateria(armadura.getBateria()-energiaRestada*2);
            armadura.setBateria(armadura.getBateria()-energiaRestada*2);
            armadura.getBotaDer().setPropulsor(armadura.getBotaDer().getPropulsor() - energiaRestada);
            armadura.getBotaIzq().setPropulsor(armadura.getBotaIzq().getPropulsor() - energiaRestada);
            System.out.println("Energia restante " + armadura.getBotaDer() + " " + armadura.getBotaIzq());
        }

    }
    
    public void Volar(){
        int danio=Danio();
        int tiempoVuelo = 0;
        System.out.println("Cuanto tiempo va a volar(en minutos)?");
        try {
            tiempoVuelo = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero entero positivo");
            sc.next();
            Volar();
        }

        int energiaRestada = (int) (tiempoVuelo * 0.48);
        int energiaRestadaGuantes=(int) (tiempoVuelo* 0.32);

        if (energiaRestada > armadura.getBotaDer().getPropulsor()||energiaRestadaGuantes > armadura.getGuanteDer().getExpulsor()) {
            System.out.println("No tiene energia suficiente");
            Volar();
        } else {
            
            armadura.getBotaDer().setSalud((armadura.getBotaDer().getSalud()-danio));
            armadura.getBotaIzq().setSalud((armadura.getBotaIzq().getSalud()-danio));
            
            int danioCasco=Danio();
            armadura.getCasco().setSalud(armadura.getCasco().getSalud()-danioCasco);
            
            int danioGuante=Danio();
            armadura.getGuanteDer().setSalud(armadura.getGuanteDer().getSalud()-danioGuante);
            armadura.getGuanteIzq().setSalud(armadura.getGuanteIzq().getSalud()-danioGuante);
            
            if(danio!=0){
               armadura.getBotaDer().setDañado(true);
               armadura.getBotaIzq().setDañado(true);
            }else if(danioCasco!=0){
                armadura.getCasco().setDañado(true);
            }else if(danioGuante!=0){
                armadura.getGuanteDer().setDañado(true);
                armadura.getGuanteIzq().setDañado(true);
            }
                        
            armadura.setBateria(armadura.getBateria()-energiaRestada*2+armadura.getBateria()-energiaRestadaGuantes*2);
            armadura.getBotaDer().setPropulsor(armadura.getBotaDer().getPropulsor() - energiaRestada);
            armadura.getBotaIzq().setPropulsor(armadura.getBotaIzq().getPropulsor() - energiaRestada);
            armadura.getGuanteDer().setExpulsor(armadura.getGuanteDer().getExpulsor()-energiaRestadaGuantes);
            armadura.getGuanteIzq().setExpulsor(armadura.getGuanteIzq().getExpulsor()-energiaRestadaGuantes);
            System.out.println("Energia restante " + armadura.getGuanteDer() + " " + armadura.getGuanteIzq());
            
            
        }
    }
    
    
    public void gastarEnergia(){
        boolean salir=false;
        System.out.println("");
        do{
            System.out.println("1-Caminar " + "\n2-Correr" +"\n3-Propulsar"+"\n4-Volar"+"\n5-Mostrar estado"+"\n6-Salir");
            int opc=sc.nextInt();
            switch(opc){
                case 1:
                    caminar();
                    break;
                case 2:
                    correr();
                    break;
                case 3:
                    propulsion();
                    break;
                case 4:
                    Volar();
                    break;
                case 5:
                    MostrarEstado();
                    break;
                case 6:
                    salir=true;
            }
        }while(!salir);
    }
    
    public void MostrarEstado(){
        System.out.println("El estado de la armadura es: " + armadura.toString());
    }
    
    public void bateria(){
        System.out.println("El estado de la bateria " + armadura.getBateria());
    }

    public void infoReactor(){
        System.out.println("El estado de la bateria en energia 2 es " + (armadura.getBateria()*2));
        System.out.println("El estado de la bateria en energia 3 es " + (armadura.getBateria()*3.84/0.65));
    }
    
    public int Danio(){
        int random=(int) (Math.random()*3);
        int danio=0;
        if(random==0){
            danio=20;
        }
        
        return danio;
    }
    
    public int Reparar(){
        int random=(int) (Math.random()*2.5);
        int reparar=0;
        if(random==0){
            reparar=20;
        }
        
        return reparar;
    }
    
    public void revisarDispositivos(){
        if(armadura.getBotaDer().getSalud()<100){
            System.out.println("Botas dañadas");
        }else if(armadura.getCasco().getSalud()<100){
            System.out.println("Casco dañado");
        }else if(armadura.getGuanteDer().getSalud()<100){
            System.out.println("Guantes dañados");
        }
    }
    
}
