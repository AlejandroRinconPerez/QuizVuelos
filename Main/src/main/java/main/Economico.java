package main;

public class Economico extends Reserva {

    public Economico(String nombre, String codigoVuelo, int precioBase) {
        super(nombre, codigoVuelo, precioBase); // Sin costo adicional para clase económica
    }
}


