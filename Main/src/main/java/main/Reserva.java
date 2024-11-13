
package main;


public abstract class Reserva {
     protected int costoAgregado;
     protected String Nombre;
     protected  String codigo;

    public Reserva(int costoAgregado, String Nombre, String codigo) {
        this.costoAgregado = costoAgregado;
        this.Nombre = Nombre;
        this.codigo = codigo;
    }

    public int getCostoAgregado() {
        return costoAgregado;
    }

    public void setCostoAgregado(int costoAgregado) {
        this.costoAgregado = costoAgregado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     
     
     
     
     
    
    
    
    
    
    
}
