package com.sistema.reservas.model;

/**
 * Represents a bus in the vehicle reservation system.
 * Inherits from the Vehicle class and adds passenger capacity specification.
 * Contains specific attributes and methods for bus management and transportation services.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Autobus extends Vehiculo {
    private int capacidadPasajeros; // Maximum passenger capacity

    /**
     * Constructor to create a Bus instance.
     * Initializes bus properties including passenger capacity.
     *
     * @param id Unique identifier for the bus
     * @param marca Brand of the bus
     * @param modelo Model of the bus
     * @param año Manufacturing year
     * @param costo Daily rental cost
     * @param capacidad Maximum number of passengers
     */
    public Autobus(String id, String marca, String modelo, int año, double costo, int capacidad) {
        super(id, marca, modelo, año, costo);
        this.capacidadPasajeros = capacidad;
    }

    /**
     * Gets the passenger capacity of the bus.
     *
     * @return Maximum number of passengers
     */
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
}