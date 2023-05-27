/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author usuario
 */
public class IronArmadura {
    private IronBota botaIzq,botaDer;
    private IronGuante guanteIzq,guanteDer;
    private IronCasco casco;
    private String colorPrimario,colorSecundario;
    private int bateria;
    
    
    public IronArmadura() {
    }

    public IronArmadura(IronBota botaIzq, IronBota botaDer, IronGuante guanteIzq, IronGuante guanteDer, IronCasco casco, String colorPrimario, String colorSecundario, int bateria) {
        this.botaIzq = botaIzq;
        this.botaDer = botaDer;
        this.guanteIzq = guanteIzq;
        this.guanteDer = guanteDer;
        this.casco = casco;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.bateria = bateria;
        
    }

    

    public IronBota getBotaIzq() {
        return botaIzq;
    }

    public void setBotaIzq(IronBota botaIzq) {
        this.botaIzq = botaIzq;
    }

    public IronBota getBotaDer() {
        return botaDer;
    }

    public void setBotaDer(IronBota botaDer) {
        this.botaDer = botaDer;
    }

    public IronGuante getGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(IronGuante guanteIzq) {
        this.guanteIzq = guanteIzq;
    }

    public IronGuante getGuanteDer() {
        return guanteDer;
    }

    public void setGuanteDer(IronGuante guanteDer) {
        this.guanteDer = guanteDer;
    }

    public IronCasco getCasco() {
        return casco;
    }

    public void setCasco(IronCasco casco) {
        this.casco = casco;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    

    @Override
    public String toString() {
        return "IronArmadura{" + "botaIzq=" + botaIzq + ", botaDer=" + botaDer + ", guanteIzq=" + guanteIzq + ", guanteDer=" + guanteDer + ", casco=" + casco + ", colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", bateria=" + bateria +  '}';
    }

    

    
    
    
}
