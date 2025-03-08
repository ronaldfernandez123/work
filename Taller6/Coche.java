/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6;

/**
 *
 * @author Usuario
 */
public class Coche {
     private static int contadorCoches = 0;
    private String marca;
    private String modelo;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static int getContadorCoches() {
        return contadorCoches;
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Focus");
        Coche coche3 = new Coche("Honda", "Civic");

        System.out.println("Se han creado " + Coche.getContadorCoches() + " coches.");
    }
}
