package ejercicio1;

public class Gato extends Animal{
    private boolean esDomestico;
    public Gato(String nombre, int edad, float peso, boolean esDomestico){
        super(nombre, edad, peso);
        this.esDomestico = esDomestico;
    }

    public boolean isEsDomestico() {return esDomestico;}
    public void setEsDomestico(boolean esDomestico) {this.esDomestico = esDomestico;}

    @Override
    public void comer() {
        System.out.println("Soy un gato y estoy comiendo atún.");
    }
    @Override
    public void dormir(){
        System.out.println("Estoy durmiendo en el sofa.");
    }
    @Override
    public void desplazarse(){
        System.out.println("Estoy saltando por los tejados");
    }
}