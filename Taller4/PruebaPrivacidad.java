/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

/**
 *
 * @author Usuario
 */
class Persona {
    private String nombre; // Atributo privado

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

// Otra clase intentando acceder directamente al atributo privado
public class PruebaPrivacidad {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");

        // Intento de acceso directo al atributo privado (Error de compilación)
        // System.out.println(persona.nombre); // Esto genera un error

        System.out.println("No se puede acceder directamente a 'nombre' porque es privado.");
    }
}
