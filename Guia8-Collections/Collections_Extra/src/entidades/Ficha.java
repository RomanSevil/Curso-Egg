/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Ficha {
    //private ArrayList<Integer>valor;
    private Integer v1;
    private Integer v2;

    public Ficha() {
    }

    public Ficha(Integer v1, Integer v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public Integer getV1() {
        return v1;
    }

    public void setV1(Integer v1) {
        this.v1 = v1;
    }

    public Integer getV2() {
        return v2;
    }

    public void setV2(Integer v2) {
        this.v2 = v2;
    }
    
    public Ficha girarFicha(Ficha invertida){
        int aux=v1;
        v1=v2;
        v2=aux;
        invertida.setV1(v1);
        invertida.setV2(v2);
        return invertida;
    }
    
    public boolean esUnDoble(Ficha ficha){
        boolean doble=false;
        if(v1.equals(v2)){
            doble=true;
        }
        return doble;
    }

    @Override
    public String toString() {
        return   v1 + ":" + v2 + "|";
    }

    

   
    
}
