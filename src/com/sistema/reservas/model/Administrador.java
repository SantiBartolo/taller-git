package com.sistema.reservas.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un administrador del sistema de reservas.
 * Gestiona la flota de vehículos y verifica disponibilidades.
 *
 * @author Santi Bartolo
 * @version 1.0
 */
public class Administrador {
    private List<Vehiculo> flota;

    /**
     * Constructor para crear una instancia de Administrador.
     * Inicializa la flota de vehículos vacía.
     */
    public Administrador() {
        this.flota = new ArrayList<>();
    }

    /**
     * Añade un nuevo vehículo a la flota del sistema.
     *
     * @param vehiculo Vehículo a agregar a la flota
     */
    public void añadirVehiculo(Vehiculo vehiculo) {
        flota.add(vehiculo);
    }

    /**
     * Verifica la disponibilidad de un vehículo en un rango de fechas.
     *
     * @param vehiculo Vehículo a verificar
     * @param inicio Fecha de inicio del período
     * @param fin Fecha de fin del período
     * @return true si el vehículo está disponible, false otherwise
     */
    public boolean verificarDisponibilidad(Vehiculo vehiculo, LocalDate inicio, LocalDate fin) {
        // Lógica simplificada: asumimos que no hay reservas superpuestas
        return vehiculo.isDisponible();
    }

    /**
     * Lista todos los vehículos disponibles en la flota.
     *
     * @return Lista de vehículos disponibles
     */
    public List<Vehiculo> listarVehiculosDisponibles() {
        List<Vehiculo> disponibles = new ArrayList<>();
        for (Vehiculo v : flota) {
            if (v.isDisponible()) disponibles.add(v);
        }
        return disponibles;
    }

    /**
     * Obtiene la flota completa de vehículos.
     *
     * @return Lista completa de vehículos
     */
    public List<Vehiculo> getFlota() {
        return flota;
    }
}