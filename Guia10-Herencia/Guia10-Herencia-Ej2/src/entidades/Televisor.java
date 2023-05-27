/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public final class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean TDT=false;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    
    
    
    
    public void crearTelevisor(){
        Scanner sc=new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion en pulgadas");
        this.setResolucion(sc.nextInt());
        
        System.out.println("El televisor tiene TDT?");
        String tdt=sc.next().toUpperCase();
        if(tdt.equalsIgnoreCase("SI")){
            this.setTDT(true);
        }
        precioFinalTv();
    }
    
    public void precioFinalTv(){
        precioFinal();
        if(this.getResolucion()>=40){
            this.setPrecio(this.getPrecio()*1.3);
        }
        
        if(this.isTDT()){
            this.setPrecio(this.getPrecio()+500);
        }
    }
    @Override
    public String toString() {
        return "Televisor [" + "Resolucion = " + resolucion + "]\n[TDT = " + TDT+"]\n[Precio = " + precio + "]\n[Color = " + color + "]\n[Peso = " + peso + "]\n[Consumo = " + consumoEnergetico + ']';
    }
    
}
