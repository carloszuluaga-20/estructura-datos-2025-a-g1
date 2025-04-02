package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class PersonaServicio {
    private List<Persona> personas = new ArrayList<>();

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void mostrarPersonas() {
        for (Persona p : personas) {
            p.mostrarInformacion();
            System.out.println();
        }
    }
}
