package com.sistema.reservas;

import com.sistema.reservas.model.*;
import java.util.Scanner;

/**
 * Main class - Interactive Vehicle Reservation System
 * Provides a console-based interface for users to interact with the reservation system.
 * Demonstrates the complete functionality of the vehicle reservation system.
 *
 * @author Santi Bartolo
 * @version 2.0 
 * Since version 1 showed the data directly from the Main in the testing, that is, it was already determined and showed it when running it, but in this version you can interact and the client can decide how many days, what vehicle to use and more
 */
public class Main {

    /**
     * Main method - Entry point of the application
     * Provides interactive menu for vehicle selection and rental calculation
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE RESERVAS INTERACTIVO ===");

        // Create administrator and populate vehicle fleet
        Administrador admin = new Administrador();
        admin.añadirVehiculo(new Auto("A001", "Toyota", "Corolla", 2022, 50.0, "Gasolina"));
        admin.añadirVehiculo(new Moto("M001", "Honda", "CBR", 2023, 30.0, 600));
        admin.añadirVehiculo(new Camioneta("C001", "Ford", "Ranger", 2022, 70.0, 1000));
        admin.añadirVehiculo(new Autobus("B001", "Mercedes", "Sprinter", 2023, 120.0, 20));

        // Display vehicle catalog to user
        System.out.println("\n--- CATÁLOGO DE VEHÍCULOS ---");
        for (int i = 0; i < admin.getFlota().size(); i++) {
            Vehiculo v = admin.getFlota().get(i);
            String tipo = "";

            // Determine vehicle type for display purposes
            if (v instanceof Auto) tipo = "Auto - Gasolina";
            else if (v instanceof Moto) tipo = "Moto";
            else if (v instanceof Camioneta) tipo = "Camioneta";
            else if (v instanceof Autobus) tipo = "Autobús";

            // Display vehicle information with formatted details
            System.out.println((i + 1) + ". " + v.getMarca() + " " + v.getModelo() +
                    " (" + tipo + ") - $" + v.getCostoDiario() + "/día");
        }

        // User selects a vehicle from the catalog
        System.out.print("\nElige un vehículo (1-" + admin.getFlota().size() + "): ");
        int eleccion = scanner.nextInt();
        Vehiculo vehiculoElegido = admin.getFlota().get(eleccion - 1);

        // User inputs rental duration
        System.out.print("¿Cuántos días de alquiler?: ");
        int dias = scanner.nextInt();

        // User selects additional services
        System.out.print("¿Incluir seguro? (si/no): ");
        boolean seguro = scanner.next().equalsIgnoreCase("si");

        System.out.print("¿Incluir GPS? (si/no): ");
        boolean gps = scanner.next().equalsIgnoreCase("si");

        // Calculate total price using vehicle's pricing method
        double precio = vehiculoElegido.calcularPrecio(dias, seguro, gps);

        // Display quotation results to user
        System.out.println("\n--- RESULTADO DE COTIZACIÓN ---");
        System.out.println("Vehículo: " + vehiculoElegido.getMarca() + " " + vehiculoElegido.getModelo());
        System.out.println("Días: " + dias);
        System.out.println("Seguro: " + (seguro ? "Sí (+10%)" : "No"));
        System.out.println("GPS: " + (gps ? "Sí ($5/día)" : "No"));
        System.out.println("Precio total: $" + precio);

        scanner.close();
    }
}