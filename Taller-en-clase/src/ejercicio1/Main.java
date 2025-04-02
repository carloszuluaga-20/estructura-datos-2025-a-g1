package ejercicio1;

public class Main {
    public static void main(String[] args) {
        AnimalService service = new AnimalService();
        service.agregarAnimal(new Perro("Firulais", 4, 12.5f, "Labrador"));
        service.agregarAnimal(new Gato("Michi", 3, 4.2f, true));
        service.agregarAnimal(new Burro("Tito", 10, 100.0f, "Gris"));
        service.agregarAnimal(new Pez("Nemo", 1, 0.3f, "Agua Salada"));
        service.mostrarAcciones();
    }
}
