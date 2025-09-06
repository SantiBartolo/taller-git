package com.sistema.reservas.model;

/**
 * Representa una camioneta en el sistema de reservas.
 * Hereda de Vehiculo y añade capacidad de carga.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Camioneta extends Vehiculo {
    private double capacidadCarga;

    /**
     * Constructor para crear una instancia de Camioneta.
     *
     * @param id Identificador único de la camioneta
     * @param marca Marca de la camioneta
     * @param modelo Modelo de la camioneta
     * @param año Año de fabricación
     * @param costo Costo diario de alquiler
     * @param capacidad Capacidad de carga en kilogramos
     */
    public Camioneta(String id, String marca, String modelo, int año, double costo, double capacidad) {
        super(id, marca, modelo, año, costo);
        this.capacidadCarga = capacidad;
    }

    /**
     * Obtiene la capacidad de carga de la camioneta.
     *
     * @return Capacidad de carga en kg
     */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}