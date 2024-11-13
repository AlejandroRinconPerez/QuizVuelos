package main;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Vuelos vueloNacional = null;
        Vuelos vueloInternacional = null;
        Reserva reserva = null;
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese\n1. Para crear un vuelo nacional \n2. Para crear un vuelo internacional  \n3. Para hacer una reserva económica nacional  \n4. Para una reserva ejecutiva nacional  \n5. Para hacer una reserva económica internacional  \n6. Para una reserva ejecutiva internacional \n7. Cancelar reserva \n0 Para Salir "));
            
            switch (opcion) {
                case 1: // Crear vuelo nacional
                    String origen = JOptionPane.showInputDialog("Ingrese el Origen: ");
                    String destino = JOptionPane.showInputDialog("Ingrese el Destino: ");
                    String codigo = JOptionPane.showInputDialog("Ingrese el Código: ");
                    int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio base: "));
                    vueloNacional = new Nacional(origen, destino, precio, codigo);
                    JOptionPane.showMessageDialog(null, vueloNacional);
                    break;
                
                case 2: // Crear vuelo internacional
                    String origenI = JOptionPane.showInputDialog("Ingrese el Origen: ");
                    String destinoI = JOptionPane.showInputDialog("Ingrese el Destino: ");
                    String codigoI = JOptionPane.showInputDialog("Ingrese el Código: ");
                    int precioI = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio base: "));
                    vueloInternacional = new Internacional(origenI, destinoI, precioI, codigoI);
                    JOptionPane.showMessageDialog(null, vueloInternacional);
                    break;

                case 3: // Reserva económica nacional
                    if (vueloNacional != null) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del pasajero: ");
                        reserva = new Economico(nombre, vueloNacional.getCodigoVuelo(), vueloNacional.getPrecioBase());
                        JOptionPane.showMessageDialog(null, reserva);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay vuelo nacional disponible.");
                    }
                    break;
                
                case 4: // Reserva ejecutiva nacional
                    if (vueloNacional != null) {
                        String nombreE = JOptionPane.showInputDialog("Ingrese el nombre del pasajero: ");
                        reserva = new Ejecutiva(nombreE, vueloNacional.getCodigoVuelo(), vueloNacional.getPrecioBase());
                        JOptionPane.showMessageDialog(null, reserva);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay vuelo nacional disponible.");
                    }
                    break;

                case 5: // Reserva económica internacional
                    if (vueloInternacional != null) {
                        String nombreI = JOptionPane.showInputDialog("Ingrese el nombre del pasajero: ");
                        reserva = new Economica(nombreI, vueloInternacional.getCodigoVuelo(), vueloInternacional.getPrecioBase());
                        JOptionPane.showMessageDialog(null, reserva);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay vuelo internacional disponible.");
                    }
                    break;
                
                case 6: // Reserva ejecutiva internacional
                    if (vueloInternacional != null) {
                        String nombreI = JOptionPane.showInputDialog("Ingrese el nombre del pasajero: ");
                        reserva = new Ejecutiva(nombreI, vueloInternacional.getCodigoVuelo(), vueloInternacional.getPrecioBase());
                        JOptionPane.showMessageDialog(null, reserva);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay vuelo internacional disponible.");
                    }
                    break;

                case 7: // Cancelar reserva
                    if (reserva != null) {
                        reserva.cancelarReserva();
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay reserva para cancelar.");
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Usted salió.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 0);
    }
}
