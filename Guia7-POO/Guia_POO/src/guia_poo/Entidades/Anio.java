/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Entidades;

/**
 *
 * @author usuario
 */
public class Anio {
    private String[] mes;
    private String mesSecreto;
    
    public Anio(){
        
    }
    
    public Anio(String[] mes,String mesSecreto){
        this.mes=mes;
        this.mesSecreto=mesSecreto;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
}
