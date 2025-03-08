public class Producto{
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }
}

class PruebaProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1200.50, 10);
        producto.mostrarInfo();
    }
}