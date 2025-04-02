package ejercicio1;

public class Perro extends Animal{
    private String raza;

    public Perro(String nombre, int edad, float peso, String raza){
        super(nombre, edad, peso);
        this.raza = raza;
    }
    public String getRaza() {return raza;}
    public void setRaza(String raza) {this.raza = raza;}

    @Override
    public void comer(){
        System.out.println("Soy un perro y estoy comiendo croquetas");
    }
    @Override
    public void dormir(){
        System.out.println("Estoy durmiendo en mi casa");
    }
    @Override
    public void desplazarse(){
        System.out.println("Estoy corriendo en el parque");
    }
}