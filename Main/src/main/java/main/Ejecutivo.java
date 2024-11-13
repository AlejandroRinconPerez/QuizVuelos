
package main;

public class Ejecutivo extends Reserva {

    public Ejecutivo(String nombre, String codigoVuelo, int precioBase) {
        super(nombre, codigoVuelo, precioBase + 50); 
    }
}