/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvuelos;

public class Internacional extends Vuelos{

    public Internacional() {
    }

    public Internacional(String Origen, String Destino, String Codigo, int precioBase) {
        super(Origen, Destino, Codigo, precioBase);
    }
      public String toString() {
        
        return String.format("Vuelo Internacional:\nOrigen: %s\nDestino: %s\nCódigo: %s\nPrecio Base: %d\nFecha: %s",
                             getOrigen(), getDestino(), getCodigo(), getPrecioBase(), getFecha());
        

            }
}
    
    
    

