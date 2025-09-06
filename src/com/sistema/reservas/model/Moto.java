package com.sistema.reservas.model;

/**
 * Representa una motocicleta en el sistema de reservas.
 * Hereda de Vehiculo y añade la cilindrada.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Moto extends Vehiculo {
    private int cilindrada;

    /**
     * Constructor para crear una instancia de Moto.
     *
     * @param id Identificador único de la moto
     * @param marca Marca de la moto
     * @param modelo Modelo de la moto
     * @param año Año de fabricación
     * @param costo Costo diario de alquiler
     * @param cilindrada Cilindrada en cc (centímetros cúbicos)
     */
    public Moto(String id, String marca, String modelo, int año, double costo, int cilindrada) {
        super(id, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
    }

    /**
     * Obtiene la cilindrada de la moto.
     *
     * @return Cilindrada en cc
     */
    public int getCilindrada() {
        return cilindrada;
    }
}