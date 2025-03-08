/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import vehiculos.Moto;

/**
 *
 * @author Usuario
 */
public class PruebaVehiculo {
    public static void main(String[] args) {
        Moto miMoto = new Moto("Deportiva");

        // Intento de acceder a un atributo con acceso de paquete
        // System.out.println(miMoto.tipo); // ❌ ERROR: tipo no es accesible fuera del paquete

        // Intento de acceder a un método público de la superclase
        miMoto.mostrarDetalles(); // ✅ Esto funciona porque el método es público

        // Intento de acceder a un método de paquete a través de la herencia
        // miMoto.mostrarTipo(); // ❌ ERROR: No accesible porque está definido con acceso de paquete
    }
}
