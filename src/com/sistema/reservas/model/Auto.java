package com.sistema.reservas.model;

/**
 * Representa un automóvil en el sistema de reservas.
 * Hereda de la clase Vehiculo y añade el tipo de combustible.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Auto extends Vehiculo {
    private String tipoCombustible; // Gasolina, Diésel, Eléctrico

    /**
     * Constructor para crear una instancia de Auto.
     *
     * @param id Identificador único del auto
     * @param marca Marca del auto
     * @param modelo Modelo del auto
     * @param año Año de fabricación
     * @param costo Costo diario de alquiler
     * @param combustible Tipo de combustible (Gasolina, Diésel, Eléctrico)
     */
    public Auto(String id, String marca, String modelo, int año, double costo, String combustible) {
        super(id, marca, modelo, año, costo);
        this.tipoCombustible = combustible;
    }

    /**
     * Obtiene el tipo de combustible del auto.
     *
     * @return Tipo de combustible (Gasolina, Diésel, Eléctrico)
     */
    public String getTipoCombustible() {
        return tipoCombustible;
    }
}