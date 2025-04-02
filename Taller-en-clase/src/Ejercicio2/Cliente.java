package Ejercicio2;

public class Cliente extends Persona {
    private int numeroCliente;
    private String historialCompras;

    public Cliente(String nombre, int edad, String direccion, int numeroCliente, String historialCompras) {
        super(nombre, edad, direccion);
        this.numeroCliente = numeroCliente;
        this.historialCompras = historialCompras;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Cliente: " + getNombre() + ", Edad: " + getEdad() + ", Dirección: " + getDireccion());
        System.out.println("Número de Cliente: " + numeroCliente + ", Historial de Compras: " + historialCompras);
    }
}
