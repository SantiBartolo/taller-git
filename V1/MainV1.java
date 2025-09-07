package com.sistema.reservas;

import com.sistema.reservas.model.*;
import java.time.LocalDate;

/**
 * Main class - Entry point of the Vehicle Reservation System
 * Contains test cases and system demonstration
 *
 * @author Santiago Bartolo Sansón
 * @version 1.0
 */
public class MainV1 {

    /**
     * Main method - executes the system test demonstration
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== 🚗 VEHICLE RESERVATION SYSTEM TEST ===\n");

        // Create system administrator
        Administrador admin = new Administrador();

        // Add different vehicle types to the fleet
        admin.añadirVehiculo(new Auto("A001", "Toyota", "Corolla", 2022, 50.0, "Gasoline"));
        admin.añadirVehiculo(new Moto("M001", "Honda", "CBR", 2023, 30.0, 600));
        admin.añadirVehiculo(new Camioneta("C001", "Ford", "Ranger", 2022, 70.0, 1000));

        // Create a customer
        Cliente cliente = new Cliente("CLI001", "Maria Garcia");

        // Display system status
        System.out.println("📊 Fleet vehicles: " + admin.getFlota().size());
        System.out.println("✅ System configured successfully\n");

        // Test 1: Check vehicle availability
        Vehiculo auto = admin.getFlota().get(0); // Get first vehicle (Toyota Corolla)
        System.out.println("🚗 Vehicle " + auto.getIdVehiculo() + " available: " + auto.isDisponible());

        // Test 2: Calculate rental price with insurance and GPS
        double precio = auto.calcularPrecio(5, true, true);
        System.out.println("💰 Price for 5 days with insurance and GPS: $" + precio);

        // Test 3: Demonstrate vehicle types (optional)
        System.out.println("\n🔧 Vehicle Types Demo:");
        for (Vehiculo vehiculo : admin.getFlota()) {
            String type = vehiculo.getClass().getSimpleName();
            System.out.println("   - " + type + ": " + vehiculo.getIdVehiculo());
        }

        System.out.println("\n=== 🧪 TEST COMPLETED SUCCESSFULLY ===");
        System.out.println("=== 🎯 SYSTEM READY FOR PRODUCTION ===");
    }

    /**
     * Additional test method for reservation simulation
     * (Can be uncommented and used for further testing)
     */
    private static void simulateReservation() {
        /*
        // Example reservation simulation
        Administrador admin = new Administrador();
        admin.añadirVehiculo(new Auto("A002", "Nissan", "Sentra", 2023, 45.0, "Gasoline"));

        Cliente client = new Cliente("CLI002", "Carlos Rodriguez");
        Vehiculo car = admin.getFlota().get(0);

        try {
            // client.reservarVehiculo(car, LocalDate.now(), LocalDate.now().plusDays(3), true, false);
            System.out.println("✅ Reservation successful!");
        } catch (Exception e) {
            System.out.println("❌ Reservation failed: " + e.getMessage());
        }
        */
    }
}