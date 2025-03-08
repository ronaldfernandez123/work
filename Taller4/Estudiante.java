/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre debe ser una cadena no vacía.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe ser un número entero positivo.");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 10) {
            this.notaPromedio = notaPromedio;
        } else {
            throw new IllegalArgumentException("La nota promedio debe ser un número entre 0 y 10.");
        }
    }

    public static void main(String[] args) {
        try {
            Estudiante estudiante1 = new Estudiante("Juan Pérez", 20, 8.5);
            System.out.println("Nombre: " + estudiante1.getNombre() + ", Edad: " + estudiante1.getEdad() + ", Nota Promedio: " + estudiante1.getNotaPromedio());

            estudiante1.setNombre("María López");
            estudiante1.setEdad(22);
            estudiante1.setNotaPromedio(9.3);
            System.out.println("Nombre: " + estudiante1.getNombre() + ", Edad: " + estudiante1.getEdad() + ", Nota Promedio: " + estudiante1.getNotaPromedio());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
