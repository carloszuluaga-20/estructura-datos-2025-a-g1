import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] platos = {"Hamburguesa", "Pizza", "Ensalada", "Gaseosa personal"};
        double[] precios = {16000, 10000, 7000, 4000};
        int[] cantidades = new int[platos.length];

        int opcion;

        do {
            System.out.println("====== Menú del Restaurante ======");
            for (int i = 0; i < platos.length; i++) {
                System.out.println((i + 1) + ". " + platos[i] + " - $" + precios[i]);
            }
            System.out.println("5. Ver Pedido");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1, 2, 3, 4:
                    System.out.print("¿Cuántos deseas?: ");
                    int cantidad = sc.nextInt();

                    // Uso de if/else para validar
                    if (cantidad > 0) {
                        cantidades[opcion - 1] += cantidad;
                        System.out.println("Agregado al pedido.\n");
                    } else if (cantidad == 0) {
                        System.out.println("No se agregó nada porque la cantidad es 0.\n");
                    } else {
                        System.out.println("Cantidad inválida. Debe ser mayor a 0.\n");
                    }
                    break;

                case 5:
                    double total = 0;
                    System.out.println("\n Tu pedido:");
                    for (int i = 0; i < platos.length; i++) {
                        if (cantidades[i] > 0) {
                            double subtotal = cantidades[i] * precios[i];
                            total += subtotal;
                            System.out.println(platos[i] + " x" + cantidades[i] + " = $" + subtotal);
                        }
                    }

                    // Uso de if/else para aplicar descuento
                    if (total > 50000) {
                        System.out.println("¡Tienes un descuento del 10% por compras mayores a $50000!");
                        total *= 0.9;
                    } else if (total == 0) {
                        System.out.println("No has agregado nada al pedido.");
                    }

                    System.out.println("Total a pagar: $" + total + "\n");
                    break;

                case 6:
                    System.out.println("Gracias por visitarnos. ¡Vuelve pronto!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.\n");
            }

        } while (opcion != 6);

        sc.close();
    }
}