package Ejercicio1.java;

public class Circunferencia extends Figura {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void mostrarArea() {
        System.out.println("Área de la Circunferencia: " + calcularArea());
    }
}