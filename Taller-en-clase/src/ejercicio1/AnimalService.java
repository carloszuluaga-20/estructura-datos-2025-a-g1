package ejercicio1;

import java.util.ArrayList;
import java.util.List;
public class AnimalService {
    private List<Animal> animales = new ArrayList<>();
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }
    public void mostrarAcciones() {
        for (Animal a : animales) {
            System.out.println("Nombre: " + a.getNombre());
            a.comer();
            a.dormir();
            a.desplazarse();
            System.out.println();
        }
    }
}
