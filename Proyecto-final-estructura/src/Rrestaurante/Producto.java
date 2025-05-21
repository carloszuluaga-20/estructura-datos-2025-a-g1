package Rrestaurante;

// Clase Producto: representa un producto del menú
public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;

    // Constructor
    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters (encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    // Método para mostrar el producto como texto
    public String toString() {
        return nombre + " - $" + precio + "\n" + descripcion;
    }
}