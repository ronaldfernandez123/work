
public class Estudiante {

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

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Carlos", 20);
        Estudiante estudiante3 = new Estudiante("Ana", 22, "Matemáticas");

        estudiante1.mostrarDetalles();
        System.out.println();
        estudiante2.mostrarDetalles();
        System.out.println();
        estudiante3.mostrarDetalles();
    }

}
