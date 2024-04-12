/*
 * Ejercicio de CampusMV 2o horas proyecto JAVA
 * 
 */
package com.mycompany.contabilidad;

/**
 *
 * @author aitanaasecas
 */

package com.mycompany.contabilidad;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.sql.DriverManager;
import java.sql.Connection;


class Cuenta {
    private final String nombre;
    private double saldo;
    private final List<Movimiento> movimientos;

    public Cuenta(String nombre) {
        this.nombre = nombre;
        this.saldo = 0.0;
        this.movimientos = new ArrayList<>();
    }

    public void agregarMovimiento(double cantidad, String descripcion) {
        Movimiento movimiento = new Movimiento(cantidad, descripcion);
        this.movimientos.add(movimiento);
        this.saldo += cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }
}

