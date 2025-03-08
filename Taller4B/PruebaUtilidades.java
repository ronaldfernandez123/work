/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4B;

/**
 *
 * @author Usuario
 */
 class Utilidades {
        public static int suma(int a, int b) {
        return a + b;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    public static double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}

public class PruebaUtilidades {
    public static void main(String[] args) {
        System.out.println("Suma: " + Utilidades.suma(5, 3));
        System.out.println("Resta: " + Utilidades.resta(5, 3));
        System.out.println("Multiplicación: " + Utilidades.multiplicacion(5, 3));
        try {
            System.out.println("División: " + Utilidades.division(10, 2));
            System.out.println("División por cero: " + Utilidades.division(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
