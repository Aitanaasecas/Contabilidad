/*
 * Ejercicio de CampusMV 2o horas proyecto JAVA
 * 
 */
package com.mycompany.contabilidad;

/**
 *
 * @author aitanaasecas
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class Movimiento {
    private final double cantidad;
    private final String descripcion;

    public Movimiento(double cantidad, String descripcion) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }
}