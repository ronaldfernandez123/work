public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }

    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1200.50);
        producto.mostrarProducto();
    }
}
