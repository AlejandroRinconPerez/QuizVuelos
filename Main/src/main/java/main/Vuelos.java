
package main;


public abstract class Vuelos {
    protected String origen ;
    protected String destino;
    protected Integer precioBase;
    protected String codigoVuelo;

  public Vuelos() {
    }

    public Vuelos(String origen, String destino, Integer precioBase, String codigoVuelo) {
        this.origen = origen;
        this.destino = destino;
        this.precioBase = precioBase;
        this.codigoVuelo = codigoVuelo;
       
    }

  
   

   

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Integer precioBase) {
        this.precioBase = precioBase;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

   

  
}


