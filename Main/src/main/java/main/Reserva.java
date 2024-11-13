
package main;

public abstract class Reserva {
    protected String nombre;
    protected String codigoVuelo;
    protected int costoTotal;

    public Reserva(String nombre, String codigoVuelo, int costoTotal) {
        this.nombre = nombre;
        this.codigoVuelo = codigoVuelo;
        this.costoTotal = costoTotal;
    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada para " + nombre + " en el vuelo " + codigoVuelo);
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    @Override
    public String toString() {
        return "Reserva a nombre de " + nombre + " - Vuelo: " + codigoVuelo + " - Costo Total: " + costoTotal;
    }
}

     
     
    
    
    
    
    
    

