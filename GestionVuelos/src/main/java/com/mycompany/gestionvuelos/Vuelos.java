/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvuelos;

/**
 *
 * @author alrip
 */
public abstract class Vuelos {
    
    protected String Origen;
    protected  String Destino;
    protected String Codigo;
    protected  int precioBase;
    protected Fecha fecha;
    

    public Vuelos() {
    }
    
    public Vuelos(String Origen, String Destino, String Codigo, int precioBase) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.Codigo = Codigo;
        this.precioBase = precioBase;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
