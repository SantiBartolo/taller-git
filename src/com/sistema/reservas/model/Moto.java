package com.sistema.reservas.model;

/**
 * Represents a motorcycle in the vehicle reservation system.
 * Inherits from the Vehicle class and adds engine displacement specification.
 * Contains specific attributes and methods for motorcycle management.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Moto extends Vehiculo {
    private int cilindrada; // Engine displacement in cubic centimeters (cc)

    /**
     * Constructor to create a Motorcycle instance.
     * Initializes motorcycle properties including engine displacement.
     *
     * @param id Unique identifier for the motorcycle
     * @param marca Brand of the motorcycle
     * @param modelo Model of the motorcycle
     * @param año Manufacturing year
     * @param costo Daily rental cost
     * @param cilindrada Engine displacement in cc (cubic centimeters)
     */
    public Moto(String id, String marca, String modelo, int año, double costo, int cilindrada) {
        super(id, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
    }

    /**
     * Gets the engine displacement of the motorcycle.
     *
     * @return Engine displacement in cc (cubic centimeters)
     */
    public int getCilindrada() {
        return cilindrada;
    }
}