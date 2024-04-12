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
import java.sql.Connection;
import java.sql.DriverManager;



public class ContabilidadApp {
    private static final ExecutorService executorService = Executors.newCachedThreadPool();
    private static final List<Cuenta> cuentas = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        // Simulación de creación de cuentas y movimientos
        for (int i = 0; i < 10; i++) {
            Cuenta cuenta = new Cuenta("Cuenta " + i);
            for (int j = 0; j < 1000; j++) {
                cuenta.agregarMovimiento(Math.random() * 1000, "Descripción " + j);
            }
            cuentas.add(cuenta);
        }

        // Ejecutar tareas en hilos independientes
        Future<?> almacenamientoFuture = executorService.submit(ContabilidadApp::almacenarDatos);
        Future<?> informeBalanceFuture = executorService.submit(ContabilidadApp::generarInformeBalance);
        Future<?> informeSumasSaldosFuture = executorService.submit(ContabilidadApp::generarInformeSumasSaldos);

        // Esperar a que todas las tareas finalicen
        try {
            almacenamientoFuture.get();
            informeBalanceFuture.get();
            informeSumasSaldosFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Apagar el ExecutorService
        executorService.shutdown();
    }

    // Almacenamiento de datos en la base de datos
    private static void almacenarDatos() {
        for (Cuenta cuenta : cuentas) {
            // Código para almacenar cuentas y movimientos en la base de datos
            // Esta operación se ejecutará en un hilo independiente
        }
    }

    // Generación de informe de balance de situación
    private static void generarInformeBalance() {
        for (Cuenta cuenta : cuentas) {
            // Código para generar informe de balance de situación
            // Esta operación se ejecutará en un hilo independiente
        }
    }

    // Generación de informe de sumas y saldos
    private static void generarInformeSumasSaldos() {
        for (Cuenta cuenta : cuentas) {
            // Código para generar informe de sumas y saldos
            // Esta operación se ejecutará en un hilo independiente
        }
    }
}
