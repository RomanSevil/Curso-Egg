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
public class Circulo extends Forma implements calculoFormas {

    private Double diametro;
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double diametro, Double radio) {
        this.diametro = diametro;
        this.radio = radio;
    }

    public Circulo(Double diametro, Double radio, Double area, Double perimetro) {
        super(area, perimetro);
        this.diametro = diametro;
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString() + " Circulo{" + "diametro=" + diametro + ", radio=" + radio + '}';
    }

    @Override
    public void calcularArea() {
       
        this.setArea(PI*Math.pow(this.getRadio(), 2d));

    }

    @Override
    public void calcularPerimetro() {
        this.setPerimetro(PI * this.getDiametro());
    }

}
