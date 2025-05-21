package Rrestaurante;

import java.util.ArrayList;
import java.util.Scanner;

// Clase principal que maneja la lógica del menú del restaurante
public class RestauranteApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear categorías y productos
        Categoria hamburguesas = new Categoria("Hamburguesas");
        hamburguesas.agregarProducto(new Producto("Clásica", "Pan, carne, queso y lechuga", 16000));
        hamburguesas.agregarProducto(new Producto("Hamburguesas BBQ", "Pan, carne, salsa BBQ y cebolla caramelizada", 18000));

        Categoria bebidas = new Categoria("Bebidas");
        bebidas.agregarProducto(new Producto("Gaseosa", "Gaseosa personal 350ml", 4000));
        bebidas.agregarProducto(new Producto("Jugo natural", "  Limonada natural", 6000));

        ArrayList<Producto> carrito = new ArrayList<>();
        int opcion;

        // Menú principal del restaurante
        do {
            System.out.println("====== Menú Principal ======");
            System.out.println("1. Ver Hamburguesas");
            System.out.println("2. Ver Bebidas");
            System.out.println("3. Ver Pedido");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    seleccionarProducto(sc, hamburguesas, carrito);
                    break;
                case 2:
                    seleccionarProducto(sc, bebidas, carrito);
                    break;
                case 3:
                    mostrarPedido(carrito);
                    break;
                case 4:
                    System.out.println("Gracias por tu visita :)");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        sc.close();
    }

    // Permite al usuario elegir un producto de una categoría
    public static void seleccionarProducto(Scanner sc, Categoria categoria, ArrayList<Producto> carrito) {
        System.out.println("== " + categoria.getNombre() + " ==");
        categoria.mostrarProductos(); // Mostrar los productos de esa categoría

        System.out.print("Elige un producto (número) o 0 para volver: ");
        int eleccion = sc.nextInt();

        // Validar opción seleccionada
        if (eleccion > 0 && eleccion <= categoria.getProductos().size()) {
            Producto seleccionado = categoria.getProductos().get(eleccion - 1);
            carrito.add(seleccionado); // Agregar producto al carrito
            System.out.println("Producto agregado al pedido: " + seleccionado.getNombre() + "\n");
        } else if (eleccion == 0) {
            System.out.println("Volviendo al menú...\n");
        } else {
            System.out.println("Opción inválida.\n");
        }
    }

    // Muestra el pedido actual y el total a pagar
    public static void mostrarPedido(ArrayList<Producto> carrito) {
        if (carrito.isEmpty()) {
            System.out.println("Tu pedido está vacío.\n");
            return;
        }

        System.out.println("Tu pedido:");
        double total = 0;
        for (Producto p : carrito) {
            System.out.println("- " + p.getNombre() + " $" + p.getPrecio());
            total += p.getPrecio();
        }

        // Aplicar descuento si total es mayor a $50000
        if (total > 50000) {
            System.out.println("¡Tienes un descuento del 10% por comprar más de $50.000!");
            total *= 0.9;
        }

        System.out.println("Total a pagar: $" + total + "\n");
    }
}