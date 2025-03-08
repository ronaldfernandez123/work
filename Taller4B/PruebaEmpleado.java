/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4B;

/**
 *
 * @author Usuario
 */
class Empleado {
      public String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo. Se asignará 0.");
            this.salario = 0;
        }
    }
}

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Pérez", 2500.50);
        Empleado empleado2 = new Empleado("Ana Gómez", -1500);

        System.out.println("Empleado 1: " + empleado1.nombre + ", Salario: " + empleado1.getSalario());
        System.out.println("Empleado 2: " + empleado2.nombre + ", Salario: " + empleado2.getSalario());

        empleado1.setSalario(3000);
        System.out.println("Nuevo salario de " + empleado1.nombre + ": " + empleado1.getSalario());

        empleado2.setSalario(-500);
        System.out.println("Salario de " + empleado2.nombre + " después de intento inválido: " + empleado2.getSalario());
    }
}
