package org.example.clases;

public class CuentaBancaria {
    private String titular_cuenta;
    private double saldo;
    private int nmr_cuenta;
    private static int ultimo_numeor = 0;

    public CuentaBancaria(String nombre, double monto){
        titular_cuenta = nombre;
        saldo = monto;
        nmr_cuenta++;
    }
    public void depositar (double monto){
        if (monto > 0){
        saldo += monto;
        }else;
        System.out.println("El monto a depositar debe ser mayor a 0");
    }

}
