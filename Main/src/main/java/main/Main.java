package main;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Vuelos vueloNacional = null;
        Vuelos vueloInternacional = null;
        Reserva reserva = null;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese:\n" +
                    "1. Crear vuelo nacional\n" +
                    "2. Crear vuelo internacional\n" +
                    "3. Hacer reserva económica nacional\n" +
                    "4. Hacer reserva ejecutiva nacional\n" +
                    "5. Hacer reserva económica internacional\n" +
                    "6. Hacer reserva ejecutiva internacional\n" +
                    "7. Cancelar reserva\n" +
                    "0. Salir"
            ));

            switch (opcion) {
                case 1:
                    String origenNacional = JOptionPane.showInputDialog("Ingrese el Origen: ");
                    String destinoNacional = JOptionPane.showInputDialog("Ingrese el Destino: ");
                    String codigoNacional = JOptionPane.showInputDialog("Ingrese el Código: ");
                    int precioNacional = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio base: "));
                    vueloNacional = new Nacional(origenNacional, destinoNacional, precioNacional, codigoNacional);
                    JOptionPane.showMessageDialog(null, "Vuelo nacional creado:\n" + vueloNacional);
                    break;

                case 2:
                    String origenInternacional = JOptionPane.showInputDialog("Ingrese el Origen: ");
                    String destinoInternacional = JOptionPane.showInputDialog("Ingrese el Destino: ");
                    String codigoInternacional = JOptionPane.showInputDialog("Ingrese el Código: ");
                    int precioInternacional = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio base: "));
                    vueloInternacional = new Internacional(origenInternacional, destinoInternacional, precioInternacional, codigoInternacional);
                    JOptionPane.showMessageDialog(null, "Vuelo internacional creado:\n" + vueloInternacional);
                    break;

                case 3:
                    if (vueloNacional != null) {
                        String nombreEcoNacional = JOptionPane.showInputDialog("Ingrese el nombre del pasajero: ");
                        reserva = new Economico(nombreEcoNacional, vueloNacional.getCodigoVuelo(), vueloNacional.getPrecioBase());
                        JOptionPane.showMessageDialog(null, "Reserva realizada:\n" + reserva);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay vuelo nacional disponible.");
                    }
                    break;

                case 4:
                    if (vueloNacional != null) {
                        String nombreEjecutivoNacional = JOptionPane.showInputDialog("Ingrese el nombre del pasajero: ");
                        reserva = new Ejecutivo(nombreEjecutivoNacional, vueloNacional.getCodigoVuelo(), vueloNacional.getPrecioBase());
                        JOptionPane.showMessageDialog(null, "Reserva realizada:\n" + reserva);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay vuelo nacional disponible.");
                    }
                    break;

                case 5:
                    if (vueloInternacional != null) {
                        String nombreEcoInternacional = JOptionPane.showInputDialog("Ingrese el nombre del pasajero: ");
                        reserva = new Economico(nombreEcoInternacional, vueloInternacional.getCodigoVuelo(), vueloInternacional.getPrecioBase());
                        JOptionPane.showMessageDialog(null, "Reserva realizada:\n" + reserva);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay vuelo internacional disponible.");
                    }
                    break;

                case 6:
                    if (vueloInternacional != null) {
                        String nombreEjecutivoInternacional = JOptionPane.showInputDialog("Ingrese el nombre del pasajero: ");
                        reserva = new Ejecutivo(nombreEjecutivoInternacional, vueloInternacional.getCodigoVuelo(), vueloInternacional.getPrecioBase());
                        JOptionPane.showMessageDialog(null, "Reserva realizada:\n" + reserva);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay vuelo internacional disponible.");
                    }
                    break;

                case 7:
                    if (reserva != null) {
                        reserva.cancelarReserva();
                        reserva = null;
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

// hola todos 