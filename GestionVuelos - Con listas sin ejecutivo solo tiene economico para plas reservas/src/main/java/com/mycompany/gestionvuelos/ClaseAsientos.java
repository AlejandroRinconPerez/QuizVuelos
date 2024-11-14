
package com.mycompany.gestionvuelos;

public abstract class ClaseAsientos {
    
    protected Vuelos vuelo; 
    protected  String nombrecliente;

    public ClaseAsientos() {
    }

    public ClaseAsientos(Vuelos vuelo, String nombrecliente) {
        this.vuelo = vuelo;
        this.nombrecliente = nombrecliente;
    }

    public Vuelos getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelos vuelo) {
        this.vuelo = vuelo;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }
    
    
}
