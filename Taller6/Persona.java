/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre; // Atributo de instancia (no estático)

    // Versión correcta: Método de instancia que puede modificar el atributo de instancia
    public void cambiarNombre(String nuevoNombre) { 
        nombre = nuevoNombre; // Correcto
    }

    public static void main(String[] args) {
        Persona p = new Persona();
        p.cambiarNombre("Juan"); // Correcto: llamamos al método desde una instancia
    }

    /*
    // Versión incorrecta: Intento de acceder a un atributo de instancia desde un método estático
    public static void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre; // Error de compilación: No se puede acceder a un atributo de instancia desde un contexto estático
    }
    */
}
