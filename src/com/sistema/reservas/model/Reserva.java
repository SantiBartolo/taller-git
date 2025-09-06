package com.sistema.reservas.model;

import java.time.LocalDate;

/**
 * Representa una reserva de vehículo en el sistema.
 * Gestiona la información de la reserva, fechas y costos asociados.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Reserva {
    private static int contador = 1;
    private String idReserva;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double costoTotal;
    private boolean seguro;
    private boolean gps;

    /**
     * Constructor para crear una instancia de Reserva.
     *
     * @param vehiculo Vehículo a reservar
     * @param cliente Cliente que realiza la reserva
     * @param inicio Fecha de inicio de la reserva
     * @param fin Fecha de fin de la reserva
     * @param seguro true si incluye seguro
     * @param gps true si incluye GPS
     */
    public Reserva(Vehiculo vehiculo, Cliente cliente, LocalDate inicio, LocalDate fin,
                   boolean seguro, boolean gps) {
        this.idReserva = "R" + contador++;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaInicio = inicio;
        this.fechaFin = fin;
        this.seguro = seguro;
        this.gps = gps;
    }

    /**
     * Confirma la reserva, calcula el costo total y marca el vehículo como no disponible.
     */
    public void confirmarReserva() {
        int dias = (int) (fechaFin.toEpochDay() - fechaInicio.toEpochDay());
        this.costoTotal = vehiculo.calcularPrecio(dias, seguro, gps);
        vehiculo.setDisponibilidad(false);
    }

    // ==================== GETTERS ====================

    /**
     * Obtiene la fecha de fin de la reserva.
     *
     * @return Fecha de fin
     */
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    /**
     * Obtiene el ID único de la reserva.
     *
     * @return ID de la reserva
     */
    public String getIdReserva() {
        return idReserva;
    }

    /**
     * Obtiene el costo total de la reserva.
     *
     * @return Costo total calculado
     */
    public double getCostoTotal() {
        return costoTotal;
    }
}