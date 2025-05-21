package Rrestaurante;

import java.util.ArrayList;

// Clase Categoria: agrupa productos por tipo (ej. Hamburguesas, Bebidas)
public class Categoria {
    private String nombre;
    private ArrayList<Producto> productos;

    // Constructor
    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto a la categoría
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    // Mostrar todos los productos de la categoría
    public void mostrarProductos() {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i).toString());
        }
    }
}