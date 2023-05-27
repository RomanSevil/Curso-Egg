/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

import java.util.Random;

/**
 *
 * @author usuario
 */
public enum razaPerro {
    BEAGLE(43424,"Beagle"), COCKER(47231,"Cocker"),PITBULL(76142,"Pitbull"),MESTIZO(46782,"Mestizo"),ROTTWEILER(76312,"Rottweiler"),LABRADOR(13467,"Labrador"),PASTOR_ALEMAN(78614,"Pastor Aleman");
    
    private Integer codigo;
    private String valor;
    //private razaPerro[] razas=values();
    
    private razaPerro() {
    }

    private razaPerro(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public static final Random generate=new Random();
    public static razaPerro randomRazas(){
        razaPerro[]razas=values();
        return razas[generate.nextInt(razas.length)];
    }

    /*public razaPerro[] getRazas() {
        return razas;
    }

    public void setRazas(razaPerro[] razas) {
        this.razas = razas;
    }*/

    
    
    
}
