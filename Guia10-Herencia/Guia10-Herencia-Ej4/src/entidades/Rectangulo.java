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
public class Rectangulo extends Forma implements calculoFormas {
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(Double base, Double altura, Double area, Double perimetro) {
        super(area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString()+" Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void calcularArea() {
        this.setArea(this.base*this.altura);
    }

    @Override
    public void calcularPerimetro() {
       this.setPerimetro((this.base+this.altura)*2);
    }
    
    
    
}
