
package com.mycompany.gestionvuelos;




public class  Nacional extends Vuelos{

    public Nacional(String Origen, String Destino, String Codigo, int precioBase) {
        super(Origen, Destino, Codigo, precioBase);
    }

    @Override
    public void setFecha(Fecha fecha) {
        super.setFecha(fecha); 
    }

    @Override
    public Fecha getFecha() {
        return super.getFecha(); 
    }

    @Override
    public void setPrecioBase(int precioBase) {
        super.setPrecioBase(precioBase); 
    }

    @Override
    public int getPrecioBase() {
        return super.getPrecioBase(); 
    }

    @Override
    public void setCodigo(String Codigo) {
        super.setCodigo(Codigo); 
    }

    @Override
    public String getCodigo() {
        return super.getCodigo(); 
    }

    @Override
    public void setDestino(String Destino) {
        super.setDestino(Destino); 
    }

    @Override
    public String getDestino() {
        return super.getDestino(); 
    }

    @Override
    public void setOrigen(String Origen) {
        super.setOrigen(Origen); 
    }

    @Override
    public String getOrigen() {
        return super.getOrigen(); 
    }
    
     @Override
    public String toString() {
        // Puedes usar el método super para acceder a los métodos heredados de la clase base
        return String.format("Vuelo Nacional:\nOrigen: %s\nDestino: %s\nCódigo: %s\nPrecio Base: %d\nFecha: %s",
                             getOrigen(), getDestino(), getCodigo(), getPrecioBase(), getFecha());

            }
}
