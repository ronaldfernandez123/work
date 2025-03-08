/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

/**
 *
 * @author Usuario
 */
public class PruebaCoche {
        public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 180);
        miCoche.mostrarInfo();
        miCoche.acelerar(20);
        miCoche.acelerar(-10);
    }
}
