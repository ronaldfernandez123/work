import java.util.Scanner;

class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    public Libro() {
        this("Desconocido", "Anónimo", 0);
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro [Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + "]";
    }
}

class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    public CuentaBancaria() {
        this("000000", 0.0, "Ahorros");
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this(numeroCuenta, 0.0, tipoCuenta);
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Número: " + numeroCuenta + ", Saldo: $" + saldo + ", Tipo: " + tipoCuenta + "]";
    }
}

class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante() {
        this("Desconocido", 0, "Sin asignar");
    }

    public Estudiante(String nombre, int edad) {
        this(nombre, edad, "Sin asignar");
    }

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso + "]";
    }
}

public class ProyectoIntegrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Autor: ");
        String autorLibro = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int paginasLibro = scanner.nextInt();
        scanner.nextLine();
        Libro libro = new Libro(tituloLibro, autorLibro, paginasLibro);

        System.out.println("\nIngrese los datos de la cuenta bancaria:");
        System.out.print("Número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldoCuenta = scanner.nextDouble();
        scanner.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldoCuenta, tipoCuenta);

        System.out.println("\nIngrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Edad: ");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Curso: ");
        String cursoEstudiante = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);

        System.out.println("\nDetalles de los objetos creados:");
        System.out.println(libro);
        System.out.println(cuenta);
        System.out.println(estudiante);

        scanner.close();
    }
}
