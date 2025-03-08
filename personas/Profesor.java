/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona {

    public Profesor(String nombre) {
        super(nombre);
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y soy profesor.");
    }
}
