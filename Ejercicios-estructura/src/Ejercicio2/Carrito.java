package Ejercicio2;

import java.util.List;
import java.util.ArrayList;

public class Carrito {
    private List<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void mostrarCarrito() {
        System.out.println("Productos en el carrito:");
        for (Producto p : productos) {
            System.out.println("- " + p.getNombre() + ": $" + p.getPrecio());
        }
        System.out.println("Total: $" + calcularTotal());
    }
}

