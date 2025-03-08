/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3;

/**
 *
 * @author Usuario
 */

class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

// 🚨 Versión Incorrecta: Cambio de firma (sobrecarga en vez de sobrescritura)
class PerroIncorrecto extends Animal {
    void hacerSonido(String tipo) { // No sobrescribe, solo sobrecarga el método
        System.out.println("El perro ladra: " + tipo);
    }
}

// 🚨 Versión Incorrecta: Sin @Override y con error tipográfico
class GatoIncorrecto {
    void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}

class GatoSiamesIncorrecto extends GatoIncorrecto {
    void hacersonido() { // Error tipográfico, no sobrescribe el método padre
        System.out.println("El gato siamés maúlla diferente");
    }
}

// ✅ Versión Correcta: Manteniendo la firma y usando @Override
class PerroCorrecto extends Animal {
    @Override
    void hacerSonido() { // Correcta sobrescritura
        System.out.println("El perro ladra");
    }
}

class GatoCorrecto {
    void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}

class GatoSiamesCorrecto extends GatoCorrecto {
    @Override
    void hacerSonido() { // Ahora sí sobrescribe correctamente
        System.out.println("El gato siamés maúlla diferente");
    }
}

public class Main {
     public static void main(String[] args) {
        // 📌 Probando la versión incorrecta de Perro
        Animal miPerro1 = new PerroIncorrecto();
        miPerro1.hacerSonido(); // Llamará al método de Animal, no al de PerroIncorrecto
        // miPerro1.hacerSonido("Fuerte"); // ❌ ERROR: No existe en Animal

        // 📌 Probando la versión incorrecta de Gato
        GatoIncorrecto miGato1 = new GatoSiamesIncorrecto();
        miGato1.hacerSonido(); // "El gato maúlla", no el de GatoSiamesIncorrecto

        // 📌 Probando la versión correcta de Perro
        Animal miPerro2 = new PerroCorrecto();
        miPerro2.hacerSonido(); // ✅ "El perro ladra"

        // 📌 Probando la versión correcta de Gato
        GatoCorrecto miGato2 = new GatoSiamesCorrecto();
        miGato2.hacerSonido(); // ✅ "El gato siamés maúlla diferente"
    }
}
