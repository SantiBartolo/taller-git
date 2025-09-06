package com.sistema.reservas.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un cliente del sistema de reservas de vehículos.
 * Gestiona la información personal del cliente y sus reservas activas.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Cliente {
    private String idCliente;
    private String nombre;
    private List<Reserva> reservas;

    /**
     * Constructor para crear una instancia de Cliente.
     *
     * @param id Identificador único del cliente
     * @param nombre Nombre completo del cliente
     */
    public Cliente(String id, String nombre) {
        this.idCliente = id;
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    /**
     * Permite al cliente reservar un vehículo si está disponible y no tiene reservas activas.
     *
     * @param vehiculo Vehículo a reservar
     * @param inicio Fecha de inicio de la reserva
     * @param fin Fecha de fin de la reserva
     * @param seguro true si incluye seguro
     * @param gps true si incluye GPS
     * @throws IllegalStateException Si el vehículo no está disponible o el cliente tiene reserva activa
     */
    public void reservarVehiculo(Vehiculo vehiculo, LocalDate inicio, LocalDate fin,
                                 boolean seguro, boolean gps) {
        if (!vehiculo.isDisponible()) {
            throw new IllegalStateException("El vehículo no está disponible.");
        }

        // Verificar si el cliente tiene reservas activas
        for (Reserva r : reservas) {
            if (r.getFechaFin().isAfter(LocalDate.now())) {
                throw new IllegalStateException("Ya tienes una reserva activa.");
            }
        }

        Reserva nuevaReserva = new Reserva(vehiculo, this, inicio, fin, seguro, gps);
        reservas.add(nuevaReserva);
        nuevaReserva.confirmarReserva();
    }

    // ==================== GETTERS ====================

    /**
     * Obtiene la lista de reservas del cliente.
     *
     * @return Lista de reservas
     */
    public List<Reserva> getReservas() {
        return reservas;
    }

    /**
     * Obtiene el ID único del cliente.
     *
     * @return ID del cliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return Nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
}