package com.sistema.reservas.model;

/**
 * Abstract class representing a generic vehicle in the reservation system.
 * Serves as the base class for all vehicle types with common attributes and methods.
 * Contains core functionality for vehicle management and price calculation.
 */
public abstract class Vehiculo {
    protected String idVehiculo;      // Unique vehicle identifier
    protected String marca;           // Vehicle brand (e.g., "Toyota")
    protected String modelo;          // Vehicle model (e.g., "Corolla")
    protected int año;                // Manufacturing year
    protected double costoDiario;     // Daily rental cost
    protected boolean disponibilidad; // Availability status

    /**
     * Constructor to create a Vehicle instance.
     *
     * @param idVehiculo Unique identifier for the vehicle
     * @param marca Brand of the vehicle
     * @param modelo Model of the vehicle
     * @param año Manufacturing year
     * @param costoDiario Daily rental cost
     */
    public Vehiculo(String idVehiculo, String marca, String modelo, int año, double costoDiario) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.costoDiario = costoDiario;
        this.disponibilidad = true; // Vehicles start as available
    }

    /**
     * Calculates the total rental price including optional services.
     *
     * @param dias Number of rental days
     * @param seguro true to include insurance (10% surcharge)
     * @param gps true to include GPS ($5 per day)
     * @return Total calculated price
     */
    public double calcularPrecio(int dias, boolean seguro, boolean gps) {
        double precioBase = dias * costoDiario;
        if (seguro) precioBase += precioBase * 0.10; // 10% insurance surcharge
        if (gps) precioBase += 5 * dias;             // $5 per day for GPS
        return precioBase;
    }

    // ==================== GETTERS AND SETTERS ====================

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getCostoDiario() {
        return costoDiario;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}