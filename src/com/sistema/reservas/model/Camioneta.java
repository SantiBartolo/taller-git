package com.sistema.reservas.model;

/**
 * Represents a truck/van in the vehicle reservation system.
 * Inherits from the Vehicle class and adds load capacity specification.
 * Contains specific attributes and methods for truck/van management.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Camioneta extends Vehiculo {
    private double capacidadCarga; // Load capacity in kilograms (kg)

    /**
     * Constructor to create a Truck/Van instance.
     * Initializes truck/van properties including load capacity.
     *
     * @param id Unique identifier for the truck/van
     * @param marca Brand of the truck/van
     * @param modelo Model of the truck/van
     * @param año Manufacturing year
     * @param costo Daily rental cost
     * @param capacidad Load capacity in kilograms (kg)
     */
    public Camioneta(String id, String marca, String modelo, int año, double costo, double capacidad) {
        super(id, marca, modelo, año, costo);
        this.capacidadCarga = capacidad;
    }

    /**
     * Gets the load capacity of the truck/van.
     *
     * @return Load capacity in kilograms (kg)
     */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}