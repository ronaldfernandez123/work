/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import personas.Persona;
import personas.Estudiante;
import personas.Profesor;
/**
 *
 * @author Usuario
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos");
        Persona estudiante = new Estudiante("Ana");
        Persona profesor = new Profesor("Luis");

        // Llamadas polimórficas al método presentarse()
        persona.presentarse();    // Salida: "Hola, soy una persona."
        estudiante.presentarse(); // Salida: "Hola, soy Ana y soy estudiante."
        profesor.presentarse();   // Salida: "Hola, soy Luis y soy profesor."
    }
}
