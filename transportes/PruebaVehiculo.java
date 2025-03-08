/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

import transportes.Vehiculo;
import transportes.Bicicleta;
/**
 *
 * @author Usuario
 */
public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        Vehiculo miBicicleta = new Bicicleta(); // Polimorfismo

        // Llamadas a los métodos
        miVehiculo.moverse();   // Salida: "El vehículo se está moviendo."
        miBicicleta.moverse();  // Salida: "La bicicleta avanza pedaleando."
    }
}
