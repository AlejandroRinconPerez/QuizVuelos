
package main;

public abstract class Vuelos {
    protected String origen;
    protected String destino;
    protected int precioBase;
    protected String codigoVuelo;

    public Vuelos(String origen, String destino, int precioBase, String codigoVuelo) {
        this.origen = origen;
        this.destino = destino;
        this.precioBase = precioBase;
        this.codigoVuelo = codigoVuelo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    @Override
    public String toString() {
        return "Vuelo de " + origen + " a " + destino + " - Código: " + codigoVuelo + " - Precio Base: " + precioBase;
    }
}


