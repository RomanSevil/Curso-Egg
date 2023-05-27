/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enums.Cobertura;
import enums.FormasPago;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int numPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private int cantCuotas;
    private FormasPago formaPago;
    private Double montoTotal;
    private Double montoGranizo;
    private Cobertura cobertura;

    public Poliza() {
    }
    
    

    public Poliza(Vehiculo vehiculo, Cliente cliente, int numPoliza, Date fechaInicio, Date fechaFin, int cantCuotas, FormasPago formaPago, Double montoTotal, Double montoGranizo, Cobertura cobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantCuotas = cantCuotas;
        this.formaPago = formaPago;
        this.montoTotal = montoTotal;
        this.montoGranizo = montoGranizo;
        this.cobertura = cobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public FormasPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormasPago formaPago) {
        this.formaPago = formaPago;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Double getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(Double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", numPoliza=" + numPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cantCuotas=" + cantCuotas + ", formaPago=" + formaPago + ", montoTotal=" + montoTotal + ", montoGranizo=" + montoGranizo + ", cobertura=" + cobertura + '}';
    }
    
    
    
    
}
