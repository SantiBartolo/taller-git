package com.sistema.reservas.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer in the vehicle reservation system.
 * Manages customer personal information and their active reservations.
 * Handles reservation operations and validation rules.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Cliente {
    private String idCliente;        // Unique customer identifier
    private String nombre;           // Customer's full name
    private List<Reserva> reservas;  // List of customer's reservations

    /**
     * Constructor to create a Customer instance.
     * Initializes an empty reservation list.
     *
     * @param id Unique identifier for the customer
     * @param nombre Full name of the customer
     */
    public Cliente(String id, String nombre) {
        this.idCliente = id;
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    /**
     * Allows a customer to reserve a vehicle if available and without active reservations.
     * Performs validation checks before creating the reservation.
     *
     * @param vehiculo Vehicle to be reserved
     * @param inicio Reservation start date
     * @param fin Reservation end date
     * @param seguro true to include insurance
     * @param gps true to include GPS
     * @throws IllegalStateException if vehicle is unavailable or customer has active reservation
     */
    public void reservarVehiculo(Vehiculo vehiculo, LocalDate inicio, LocalDate fin,
                                 boolean seguro, boolean gps) {
        if (!vehiculo.isDisponible()) {
            throw new IllegalStateException("Vehicle is not available.");
        }

        // Check if customer has any active reservations
        for (Reserva r : reservas) {
            if (r.getFechaFin().isAfter(LocalDate.now())) {
                throw new IllegalStateException("You already have an active reservation.");
            }
        }

        Reserva nuevaReserva = new Reserva(vehiculo, this, inicio, fin, seguro, gps);
        reservas.add(nuevaReserva);
        nuevaReserva.confirmarReserva();
    }

    // ==================== GETTERS ====================

    /**
     * Gets the list of customer's reservations.
     *
     * @return List of reservation objects
     */
    public List<Reserva> getReservas() {
        return reservas;
    }

    /**
     * Gets the unique customer identifier.
     *
     * @return Customer ID
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Gets the customer's full name.
     *
     * @return Customer name
     */
    public String getNombre() {
        return nombre;
    }
}