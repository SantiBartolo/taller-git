package com.sistema.reservas.model;

/**
 * Representa un autobús en el sistema de reservas.
 * Hereda de Vehiculo y añade capacidad de pasajeros.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Autobus extends Vehiculo {
    private int capacidadPasajeros;

    /**
     * Constructor para crear una instancia de Autobus.
     *
     * @param id Identificador único del autobús
     * @param marca Marca del autobús
     * @param modelo Modelo del autobús
     * @param año Año de fabricación
     * @param costo Costo diario de alquiler
     * @param capacidad Número máximo de pasajeros
     */
    public Autobus(String id, String marca, String modelo, int año, double costo, int capacidad) {
        super(id, marca, modelo, año, costo);
        this.capacidadPasajeros = capacidad;
    }

    /**
     * Obtiene la capacidad de pasajeros del autobús.
     *
     * @return Número máximo de pasajeros
     */
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
}