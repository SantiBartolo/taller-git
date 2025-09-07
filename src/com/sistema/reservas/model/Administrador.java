package com.sistema.reservas.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an administrator in the vehicle reservation system.
 * Manages the vehicle fleet and handles availability verification.
 * Responsible for fleet operations and inventory management.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Administrador {
    private List<Vehiculo> flota; // Complete vehicle fleet list

    /**
     * Constructor to create an Administrator instance.
     * Initializes an empty vehicle fleet.
     */
    public Administrador() {
        this.flota = new ArrayList<>();
    }

    /**
     * Adds a new vehicle to the system fleet.
     *
     * @param vehiculo Vehicle to be added to the fleet
     */
    public void añadirVehiculo(Vehiculo vehiculo) {
        flota.add(vehiculo);
    }

    /**
     * Verifies vehicle availability for a specific date range.
     * Currently uses simplified logic (checks current availability only).
     *
     * @param vehiculo Vehicle to check availability for
     * @param inicio Start date of the period
     * @param fin End date of the period
     * @return true if vehicle is available, false otherwise
     */
    public boolean verificarDisponibilidad(Vehiculo vehiculo, LocalDate inicio, LocalDate fin) {
        // Simplified logic: assumes no overlapping reservations
        return vehiculo.isDisponible();
    }

    /**
     * Lists all currently available vehicles in the fleet.
     *
     * @return List of available vehicles
     */
    public List<Vehiculo> listarVehiculosDisponibles() {
        List<Vehiculo> disponibles = new ArrayList<>();
        for (Vehiculo v : flota) {
            if (v.isDisponible()) disponibles.add(v);
        }
        return disponibles;
    }

    /**
     * Gets the complete vehicle fleet.
     *
     * @return Complete list of vehicles in the fleet
     */
    public List<Vehiculo> getFlota() {
        return flota;
    }
}