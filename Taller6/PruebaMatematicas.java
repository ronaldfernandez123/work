/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6;

/**
 *
 * @author Usuario
 */
class Matematicas {
    public static int suma(int a, int b) {
        return a + b;
    }
    
    public static int resta(int a, int b) {
        return a - b;
    }
    
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    
    public static double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}

public class PruebaMatematicas {
    public static void main(String[] args) {
        System.out.println("Suma: " + Matematicas.suma(10, 5));
        System.out.println("Resta: " + Matematicas.resta(10, 5));
        System.out.println("Multiplicación: " + Matematicas.multiplicacion(10, 5));
        System.out.println("División: " + Matematicas.division(10, 5));
    }
}
