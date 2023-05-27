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
public final  class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

   @Override
    public String toString() {
        return "Lavadora [" + "Carga = " + carga + "]\n[Precio = " + precio + "]\n[Color = " + color + "]\n[Peso = " + peso + "]\n[Consumo = " + consumoEnergetico + ']';
    }
    
    
    
    public void crearLavadora(){
        Scanner sc=new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        crearElectrodomestico();
        
        System.out.println("Ingrese la carga que soporta el lavarropas");
        this.setCarga(sc.nextInt());
        
        precioFinalLavadora();
    }
    
    public void precioFinalLavadora(){
        precioFinal();
        if(this.getCarga()>30){
            this.setPrecio(this.getPrecio()+500);
        }
    }
    
     
}
