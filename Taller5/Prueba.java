/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5;

/**
 *
 * @author Usuario
 */
// Superclase Vehiculo
class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    // Métodos públicos para acceder a las propiedades protected
    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void mostrarDatos() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca);
    }
}

// Subclase Moto
class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int cilindrada) {
        super("Moto", marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarDatosMoto() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca + ", Cilindrada: " + cilindrada + "cc");
    }
}

// Clase de prueba
public class Prueba {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Coche", "Toyota");
        Moto moto = new Moto("Yamaha", 600);

        // Acceso válido dentro de la subclase
        moto.mostrarDatosMoto(); 

        // Intento de acceso desde una clase no relacionada
        System.out.println("Accediendo desde Prueba:");

        // ERROR: No se puede acceder directamente a miembros protected desde aquí
        // System.out.println(vehiculo.tipo);  // ERROR: tipo tiene acceso protected
        // System.out.println(vehiculo.marca); // ERROR: marca tiene acceso protected

        // Solución: Acceder a través de métodos públicos
        System.out.println("Tipo de vehículo: " + vehiculo.getTipo());
        System.out.println("Marca del vehículo: " + vehiculo.getMarca());

        // También podemos llamar al método mostrarDatos()
        vehiculo.mostrarDatos();
    }
}

