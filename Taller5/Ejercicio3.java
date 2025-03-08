/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5;

/**
 *
 * @author Usuario
 */
class Banco {
    private double saldo; // ✅ Corrección: saldo es privado

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad no válida.");
        }
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Banco cuenta = new Banco(1000);
        
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cuenta.depositar(500);
        cuenta.retirar(300);
        cuenta.retirar(2000); // ❌ Error: Fondos insuficientes
    }
}
