/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miPaquete;

/**
 *
 * @author Usuario
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", 25);

        // Accediendo al atributo de paquete (default)
        System.out.println("Edad: " + p.edad); // Se puede acceder porque está en el mismo paquete

        // Intentando acceder al atributo privado directamente (esto causaría un error)
        // System.out.println("Nombre: " + p.nombre); // Error: nombre tiene acceso privado

        // Accediendo al atributo privado a través de métodos públicos
        System.out.println("Nombre: " + p.getNombre()); // Correcto

        // Modificando el atributo privado a través del setter
        p.setNombre("Carlos");
        System.out.println("Nuevo Nombre: " + p.getNombre());
    }
}
