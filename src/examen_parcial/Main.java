/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_parcial;

/**
 *
 * @author Luis Fernando
 */
package examen_parcial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ArregloCliente arregloClientes = new ArregloCliente();
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        
        while (opcion != 5) {
            
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Buscar Cliente por RUC");
            System.out.println("3. Agregar Oferta a un Cliente");
            System.out.println("4. Mostrar Ofertas de un Cliente");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            
            opcion = input.nextInt();
            input.nextLine(); 
            
            switch (opcion) {
                case 1:
                    
                    System.out.print("Ingrese el RUC del cliente: ");
                    String ruc = input.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = input.nextLine();
                    System.out.print("Ingrese el email del cliente: ");
                    String email = input.nextLine();
                    System.out.print("Ingrese el teléfono del cliente: ");
                    String telefono = input.nextLine();
                    System.out.print("Ingrese la clave del cliente: ");
                    String clave = input.nextLine();
                    arregloClientes.agregar(ruc, nombre, email, telefono, clave);
                    System.out.println("Cliente agregado exitosamente.");
                    break;
                    
                case 2:
                    
                    System.out.print("Ingrese el RUC del cliente a buscar: ");
                    ruc = input.nextLine();
                    Cliente cliente = arregloClientes.buscar(ruc);
                    if (cliente != null) {
                        System.out.println("Cliente encontrado: " + cliente.getNombre());
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                    
                case 3:
                    
                    System.out.print("Ingrese el RUC del cliente: ");
                    ruc = input.nextLine();
                    cliente = arregloClientes.buscar(ruc);
                    if (cliente != null) {
                        System.out.print("Ingrese el puesto de la oferta: ");
                        String puesto = input.nextLine();
                        System.out.print("Ingrese la descripción de la oferta: ");
                        String descripcion = input.nextLine();
                        System.out.print("Ingrese el área de la oferta: ");
                        String area = input.nextLine();
                        System.out.print("Ingrese la fecha de inicio (YYYY-MM-DD): ");
                        String fechaInicio = input.nextLine();
                        System.out.print("Ingrese la fecha de término (YYYY-MM-DD): ");
                        String fechaTermino = input.nextLine();
                        Oferta oferta = new Oferta(puesto, descripcion, area, fechaInicio, fechaTermino);
                        cliente.agregarOferta(oferta);
                        System.out.println("Oferta agregada exitosamente al cliente.");
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                    
                case 4:
                    // Mostrar Ofertas de un Cliente
                    System.out.print("Ingrese el RUC del cliente: ");
                    ruc = input.nextLine();
                    cliente = arregloClientes.buscar(ruc);
                    if (cliente != null) {
                        System.out.println("Ofertas del cliente " + cliente.getNombre() + ":");
                        for (Oferta o : cliente.getOfertas()) {
                            System.out.println(" - Puesto: " + o.getPuesto() + ", Descripción: " + o.getDescripcion());
                        }
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                    
                case 5:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    break;
            }
        }
        
        
        input.close();
    }
}
