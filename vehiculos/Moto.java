/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author Usuario
 */
public class Moto extends Vehiculo {
    
    public Moto(String tipo) {
        super(tipo);
    }
    public void mostrarDetalles() {
        System.out.println("Esto es una moto.");
        mostrarTipo(); // Intento de acceder al método de la superclase
    }
}
