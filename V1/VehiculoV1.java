package com.sistema.reservas.model;

/**
 * Clase abstracta que representa un vehículo genérico en el sistema de reservas.
 * Contiene atributos comunes a todos los vehículos y métodos para gestión básica.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public abstract class VehiculoV1 {
    protected String idVehiculo;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double costoDiario;
    protected boolean disponibilidad;

    /**
     * Constructor para crear una instancia de Vehiculo.
     *
     * @param idVehiculo Identificador único del vehículo
     * @param marca Marca del vehículo (ej: "Toyota")
     * @param modelo Modelo del vehículo (ej: "Corolla")
     * @param año Año de fabricación del vehículo
     * @param costoDiario Costo base de alquiler por día
     */
    public Vehiculo(String idVehiculo, String marca, String modelo, int año, double costoDiario) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.costoDiario = costoDiario;
        this.disponibilidad = true; // Todos los vehículos empiezan disponibles
    }

    /**
     * Calcula el precio total del alquiler considerando días, seguro y GPS.
     *
     * @param dias Número de días de alquiler
     * @param seguro true si incluye seguro (10% adicional)
     * @param gps true si incluye GPS ($5 por día)
     * @return Precio total calculado
     */
    public double calcularPrecio(int dias, boolean seguro, boolean gps) {
        double precioBase = dias * costoDiario;
        if (seguro) precioBase += precioBase * 0.10; // 10% adicional por seguro
        if (gps) precioBase += 5 * dias; // $5 por día por GPS
        return precioBase;
    }

    // ==================== GETTERS Y SETTERS ====================

    /**
     * Verifica si el vehículo está disponible para alquiler.
     *
     * @return true si está disponible, false otherwise
     */
    public boolean isDisponible() {
        return disponibilidad;
    }

    /**
     * Establece la disponibilidad del vehículo.
     *
     * @param disponibilidad true para disponible, false para no disponible
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }
}