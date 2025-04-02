package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        PersonaServicio service = new PersonaServicio();

        service.agregarPersona(new Cliente("Carlos", 30, "Calle 123", 101, "Compra de electrónicos"));
        service.agregarPersona(new Empleado("Ana", 25, "Avenida 456", 202, "Gerente", 3500.00));

        service.mostrarPersonas();
    }
}