package Ejercicio2;

public class Empleado extends Persona {
    private int codigoEmpleado;
    private String cargo;
    private double salario;

    public Empleado(String nombre, int edad, String direccion, int codigoEmpleado, String cargo, double salario) {
        super(nombre, edad, direccion);
        this.codigoEmpleado = codigoEmpleado;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado: " + getNombre() + ", Edad: " + getEdad() + ", Dirección: " + getDireccion());
        System.out.println("Código: " + codigoEmpleado + ", Cargo: " + cargo + ", Salario: $" + salario);
    }
}
