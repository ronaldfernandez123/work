public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante() {
        this("Desconocido", 0);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarEstudiante();

        Estudiante estudiante2 = new Estudiante("Juan", 20);
        estudiante2.mostrarEstudiante();
    }
}
