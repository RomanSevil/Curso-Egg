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
public class Forma {
    private Double area;
    private Double perimetro;

    public Forma() {
    }

    public Forma(Double area, Double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Forma{" + "area=" + area + ", perimetro=" + perimetro + '}';
    }
    
}
