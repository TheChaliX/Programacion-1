package org.example;

import org.example.clases.CuentaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

            CuentaBancaria c1 = new CuentaBancaria("Ana Lopez", 5000);
            c1.depositar(1500);
            c1.retirar(800);
            c1.imprimirResumen();
            CuentaBancaria c2 = new CuentaBancaria("Luis Sarco" , 1500);
            c2.depositar(500);
            c2.retirar(2500);
            c2.imprimirResumen();
    }
}