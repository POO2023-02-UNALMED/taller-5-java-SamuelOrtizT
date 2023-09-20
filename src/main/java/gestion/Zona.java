package gestion;
import java.util.List;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private List<Zoologico> zoo = new ArrayList<>(1);
    private List<Animal> animales = new ArrayList<>();

    public Zona () {}
    public Zona (String nombre, Zoologico zona) {
        this.nombre = nombre;
        this.zoo.add(zona);
    }

    public void agregarAnimales (Animal animal1) {
        this.animales.add(animal1);
    }
    public int cantidadAnimales () {
        return this.animales.size();
    }
    public String getNombre () {
        return this.nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public Zoologico getZoo () {
        return this.zoo.get(0);
    }
    public void setZoo (List<Zoologico> zoo) {
        this.zoo = zoo;
    }
    public List<Animal> getAnimales () {
        return this.animales;
    }
    public void setAnimales (List<Animal> animales) {
        this.animales = animales;
    }
}
