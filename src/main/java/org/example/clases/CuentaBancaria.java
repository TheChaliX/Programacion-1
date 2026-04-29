package org.example.clases;

/**
 * Representa una cuenta bancaria con operaciones básicas de depósito y retiro.
 * El número de cuenta se asigna automáticamente de forma incremental.
 * @author TheChaliX
 * @version 1.0
 */

public class CuentaBancaria {
    private String titular_cuenta;
    private double saldo;
    private int nmr_cuenta;
    private static int ultimo_numeor = 0;

    /**
     * Crea una nueva cuenta bancaria con titular y saldo inicial.
     * El número de cuenta se asigna automáticamente.
     * @param nombre Nombre del titular de la cuenta.
     * @param monto Saldo inicial de la cuenta.
     */

    public CuentaBancaria(String nombre, double monto){
        titular_cuenta = nombre;
        saldo = monto;
        nmr_cuenta++;
    }

    /**
     * Deposita un monto al saldo de la cuenta.
     * @param monto Cantidad a depositar. Debe ser mayor a 0.
     */

    public void depositar (double monto){
        if (monto > 0){
        saldo += monto;
        }else{
        System.out.println("El monto a depositar debe ser mayor a 0");
        }
    }

    /**
     * Retira un monto del saldo de la cuenta.
     * @param monto Cantidad a retirar. Debe ser mayor a 0 y no superar el saldo disponible.
     */

    public void retirar (double monto){
        if (monto > 0 && saldo >=monto){
            saldo -= monto;
        }else{
            System.out.println("Saldo insuficiente o monto negativo");
        }
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return Nombre del titular.
     */

    public String getTitular_cuenta(){
        return titular_cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return Saldo disponible.
     */

    public double getSaldo(){
        return saldo;
    }

    /**
     * Obtiene el número de cuenta asignado automáticamente.
     * @return Número de cuenta.
     */

    public int getNmr_cuenta(){
        return nmr_cuenta;
    }

    /**
     * Imprime en consola un resumen con el número de cuenta, titular y saldo.
     */

    public void imprimirResumen(){
        System.out.println("Cuenta #" + nmr_cuenta + "| Titular " + titular_cuenta + "| Saldo: $" + saldo);
    }

}
