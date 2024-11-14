/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestionvuelos;

import java.util.ArrayList;
import java.util.*;

import java.util.Scanner;

public class GestionVuelos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Nacional> vuelosNacionales = new ArrayList<Nacional>();
        ArrayList<Internacional> vuelosInternacionales = new ArrayList<Internacional>();
        ArrayList<Economico> ecoInternacional  = new ArrayList<Economico>();
        ArrayList<Economico> econacional  = new ArrayList<Economico>();
        int opcion = 0;

        do {
            // Menú principal
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Crear un Vuelo");
            System.out.println("2. Ver Vuelos Nacionales ");
            System.out.println("3. Ver Vuelos internacioles");
            System.out.println("4. Asignar Vuelo Nacional");
            System.out.println("5. Asignar Vuelo internacionales");
            System.out.println("6. Ver reservas internacionael");
            System.out.println("7. Ver reservas nacioanels ");

            System.out.println("0. Para Salir ");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            // Switch para manejar las opciones
            switch (opcion) {
                case 1:

                    do {
                        System.out.println("****Crear Un vuelo******");
                        System.out.println("1. Para vuelo Nacional... ");
                        System.out.println("2. Para Vuelo internacional... ");
                        System.out.println("3. Para Salir");
                        opcion = scanner.nextInt();
                        switch (opcion) {
                            case 1:
                                String salto = scanner.nextLine();//  linea para solucionar que el scaner no lee. 
                                System.out.println("Origen ");
                                String origen = scanner.nextLine();
                                System.out.println("Destino ");
                                String destino = scanner.nextLine();
                                System.out.println("Codigo");
                                String codigo = scanner.nextLine();
                                System.out.println("Precio");
                                int precioBase = scanner.nextInt();
                                vuelosNacionales.add(new Nacional(origen, destino, codigo, precioBase));
                                System.out.println("VUELO CREADO CON EXITO");
                                System.out.println("""
                                                        Vuelo creado con éxito
                                                        Origen: %s
                                                        Destino: %s
                                                        Código de Vuelo: %s
                                                        Precio Base: %d
                                                        """.formatted(origen, destino, codigo, precioBase));
                                break;
                            case 2:
                                String salto2 = scanner.nextLine();//  linea para solucionar que el scaner no lee. 
                                System.out.println("Origen ");
                                String origen2 = scanner.nextLine();
                                System.out.println("Destino ");
                                String destino2 = scanner.nextLine();
                                System.out.println("Codigo");
                                String codigo2 = scanner.nextLine();
                                System.out.println("Precio");
                                int precioBase2 = scanner.nextInt();
                                vuelosInternacionales.add(new Internacional(origen2, destino2, codigo2, precioBase2));
                                System.out.println("VUELO CREADO CON EXITO");
                                System.out.println("""
                                                        Vuelo creado con éxito
                                                        Origen: %s
                                                        Destino: %s
                                                        Código de Vuelo: %s
                                                        Precio Base: %d
                                                        """.formatted(origen2, destino2, codigo2, precioBase2));
                                break;

                        }
                    } while (opcion != 3);

                    break;
                case 2:
                    System.out.println("***** Ver Vuelos Nacionales ******");
                    if (vuelosNacionales.isEmpty()) {
                        System.out.println("No hay vuelos nacionales registrados.");
                    } else {
                        for (Nacional i : vuelosNacionales) {
                            System.out.println(i);
                        }
                    }
                    break;

                case 3:
                    System.out.println("***** Ver Vuelos Internacionales ******");
                    if (vuelosInternacionales.isEmpty()) {
                        System.out.println("No hay vuelos internacionales registrados.");
                    } else {
                        for (Internacional i : vuelosInternacionales) {
                            System.out.println(i);  
                        }
                    }
                    break;
                case 4:
                    // esta parte del codigo es para asignar un vuelo nacional a un pasajero por su nombre economico
                    System.out.println("***** Ver Vuelos Nacionales ******");
                    if(vuelosNacionales.isEmpty()){
                        System.out.println("No hay Vuelos por Asignar");
                    } else {
                        int index = 0;
                        for (Nacional i : vuelosNacionales) {
                            System.out.printf("Vuelo Código %s con identificador %d%n", i.getCodigo(), index);
                            index++;}
                        
                    System.out.println("Nombre Pasajero ");
                    String nombreecona = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Identificador de Vuelo ");
                    int posicion =scanner.nextInt();
                    scanner.nextLine();
                    econacional.add(new Economico(vuelosNacionales.get(posicion),nombreecona));
                    System.out.println("Vuelo Asignado");
                    System.out.println(econacional);            
                     break;
                  }
                case 5:
                     // Esta parte es para Interrnacionmal Economico
                    System.out.println("***** Ver Vuelos Internacionales ******");
                    if(vuelosInternacionales.isEmpty()){
                        System.out.println("No hay Vuelos por Asignar");
                    } else {
                        int index = 0;
                        for (Internacional i : vuelosInternacionales) {
                            System.out.printf("Vuelo Código %s con identificador %d%n", i.getCodigo(), index);
                            index++;}
                        
                    System.out.println("Nombre Pasajero ");
                    String nombreecoin = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Identificador de Vuelo ");
                    int posicion =scanner.nextInt();
                    scanner.nextLine();
                    ecoInternacional.add(new Economico(vuelosInternacionales.get(posicion),nombreecoin));
                    System.out.println("Vuelo Asignado");
                    System.out.println(ecoInternacional);            
                     break;
                  }
                case 6:
                    System.out.println("***** Ver Reservas Internacionales ******");
                    if (ecoInternacional.isEmpty()) {
                        System.out.println("No hay vuelos internacionales registrados.");
                    } else {
                        for (Economico i : ecoInternacional) {
                            System.out.println(i);  
                        }
                    }
                    break;
                case 7:
                    System.out.println("***** Ver Reservas Nacionales ******");
                    if (econacional.isEmpty()) {
                        System.out.println("No hay vuelos internacionales registrados.");
                    } else {
                        for (Economico i : econacional) {
                            System.out.println(i);  
                        }
                    }
                    break;
                   
                    
                    
                    
                    
                    
                    
                    
                    
                    
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 0);

    }
}
