package Ejercicio2;

public abstract class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getDireccion() { return direccion; }

    public abstract void mostrarInformacion();
}
