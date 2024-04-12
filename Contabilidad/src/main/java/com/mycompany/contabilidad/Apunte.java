/*
 * Ejercicio de CampusMV 2o horas proyecto JAVA
 * 
 */
package com.mycompany.contabilidad;

/**
 *
 * @author aitanaasecas
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.sql.Connection;
import java.sql.DriverManager;


class Apunte {
    public static void main(String[] args) {
        // Ejemplo de uso de las clases Cuenta y Movimiento
        Cuenta cuenta = new Cuenta("Cuenta principal");

        cuenta.agregarMovimiento(100.0, "Depósito inicial");
        cuenta.agregarMovimiento(-50.0, "Pago de recibo");
        cuenta.agregarMovimiento(200.0, "Ingreso nómina");
        cuenta.agregarMovimiento(-80.0, "Transferencia");

        // Mostrar saldo y movimientos de la cuenta
        System.out.println("Saldo actual: €" + cuenta.getSaldo());
        System.out.println("Movimientos:");
        List<Movimiento> movimientos = cuenta.getMovimientos();
        for (Movimiento movimiento : movimientos) {
            System.out.println(movimiento.getDescripcion() + ": €" + movimiento.getCantidad());
        }
    }
}
        