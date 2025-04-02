package ejercicio1;

public class Pez extends Animal {
    private String tipoAgua;
    public Pez(String nombre, int edad, float peso, String tipoAgua) {
        super(nombre, edad, peso);
        this.tipoAgua = tipoAgua;
    }
    public String getTipoAgua() { return tipoAgua; }
    public void setTipoAgua(String tipoAgua) { this.tipoAgua = tipoAgua; }
    @Override
    public void comer() {
        System.out.println("Soy un pez y estoy comiendo algas.");
    }
    @Override
    public void dormir() {
        System.out.println("Estoy durmiendo flotando.");
    }
    @Override
    public void desplazarse() {
        System.out.println("Estoy nadando en el agua.");
    }
}
