package com.sistema.reservas.model;

/**
 * Represents a car in the vehicle reservation system.
 * Inherits from the Vehicle class and adds fuel type specification.
 * Contains specific attributes and methods for automobile management.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Auto extends Vehiculo {
    private String tipoCombustible; // Fuel type: Gasoline, Diesel, Electric

    /**
     * Constructor to create a Car instance.
     * Initializes car properties including fuel type.
     *
     * @param id Unique identifier for the car
     * @param marca Brand of the car
     * @param modelo Model of the car
     * @param año Manufacturing year
     * @param costo Daily rental cost
     * @param combustible Fuel type (Gasoline, Diesel, Electric)
     */
    public Auto(String id, String marca, String modelo, int año, double costo, String combustible) {
        super(id, marca, modelo, año, costo);
        this.tipoCombustible = combustible;
    }

    /**
     * Gets the fuel type of the car.
     *
     * @return Fuel type (Gasoline, Diesel, Electric)
     */
    public String getTipoCombustible() {
        return tipoCombustible;
    }
}