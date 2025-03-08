package Taller1;

public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("123456", "Corriente");
        CuentaBancaria cuenta3 = new CuentaBancaria("789012", 1500.75, "Ahorros");

        cuenta1.mostrarDetalles();
        System.out.println();
        cuenta2.mostrarDetalles();
        System.out.println();
        cuenta3.mostrarDetalles();
    }
}
