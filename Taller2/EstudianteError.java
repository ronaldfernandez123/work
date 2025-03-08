public class EstudianteError {
    private String nombre;
    private int edad;

    public EstudianteError() {
        this("Desconocido", 0);
    }

    public EstudianteError(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void metodoStaticoIncorrecto() {
        // System.out.println("Nombre: " + this.nombre); // Esto causará un error
        System.out.println("Este método no puede acceder a this");
    }

    public static void main(String[] args) {
        EstudianteError estudiante1 = new EstudianteError();
        estudiante1.mostrarEstudiante();

        EstudianteError estudiante2 = new EstudianteError("Juan", 20);
        estudiante2.mostrarEstudiante();
    }
}