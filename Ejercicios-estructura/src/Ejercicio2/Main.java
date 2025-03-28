package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Laptop", 1500000.00);
        Producto producto2 = new Producto("Mouse", 250000.000);
        Producto producto3 = new Producto("Teclado", 300000.00);

        // Crear carrito
        Carrito carrito = new Carrito();

        // Agregar productos al carrito
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        // Mostrar los productos en el carrito
        carrito.mostrarCarrito();

        // Calcular y mostrar el total
        double total = carrito.calcularTotal();
        System.out.println("Total a pagar: $" + total);
    }
}
