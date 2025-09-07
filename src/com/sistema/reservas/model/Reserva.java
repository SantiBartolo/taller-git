package com.sistema.reservas.model;

import java.time.LocalDate;

/**
 * Represents a vehicle reservation in the system.
 * Manages reservation information, dates, and associated costs.
 * Handles reservation confirmation and cost calculation.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Reserva {
    private static int contador = 1;          // Static counter for auto-generating reservation IDs
    private String idReserva;                 // Unique reservation identifier
    private Cliente cliente;                  // Customer making the reservation
    private Vehiculo vehiculo;                // Vehicle being reserved
    private LocalDate fechaInicio;            // Reservation start date
    private LocalDate fechaFin;               // Reservation end date
    private double costoTotal;                // Total calculated cost
    private boolean seguro;                   // Insurance inclusion flag
    private boolean gps;                      // GPS inclusion flag

    /**
     * Constructor to create a Reservation instance.
     * Auto-generates reservation ID and initializes all reservation details.
     *
     * @param vehiculo Vehicle to be reserved
     * @param cliente Customer making the reservation
     * @param inicio Reservation start date
     * @param fin Reservation end date
     * @param seguro true to include insurance
     * @param gps true to include GPS
     */
    public Reserva(Vehiculo vehiculo, Cliente cliente, LocalDate inicio, LocalDate fin,
                   boolean seguro, boolean gps) {
        this.idReserva = "R" + contador++;    // Auto-generate ID: R1, R2, R3...
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaInicio = inicio;
        this.fechaFin = fin;
        this.seguro = seguro;
        this.gps = gps;
    }

    /**
     * Confirms the reservation by calculating total cost and marking vehicle as unavailable.
     * Calculates rental days and applies additional services costs.
     */
    public void confirmarReserva() {
        int dias = (int) (fechaFin.toEpochDay() - fechaInicio.toEpochDay());
        this.costoTotal = vehiculo.calcularPrecio(dias, seguro, gps);
        vehiculo.setDisponibilidad(false);    // Mark vehicle as reserved
    }

    // ==================== GETTERS ====================

    /**
     * Gets the reservation end date.
     *
     * @return End date of the reservation
     */
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    /**
     * Gets the unique reservation identifier.
     *
     * @return Reservation ID
     */
    public String getIdReserva() {
        return idReserva;
    }

    /**
     * Gets the total calculated cost of the reservation.
     *
     * @return Total cost including additional services
     */
    public double getCostoTotal() {
        return costoTotal;
    }
}