package Ejercicio1.java;

public class Ejecutar {
    public static void main(String[] args) {
        System.out.println("Calculando Áreas de Figuras");

        Circunferencia circunferencia = new Circunferencia(11);
        circunferencia.mostrarArea();

        Cuadrado cuadrado = new Cuadrado(4);
        cuadrado.mostrarArea();

        Rectangulo rectangulo = new Rectangulo(8, 5);
        rectangulo.mostrarArea();

        Triangulo triangulo = new Triangulo(3, 9);
        triangulo.mostrarArea();
    }
}