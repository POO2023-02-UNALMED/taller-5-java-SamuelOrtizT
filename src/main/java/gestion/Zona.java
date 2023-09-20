package gestion;
import java.util.List;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
    String nombre;
    List<Zoologico> zoo = new ArrayList<>(1);
    List<Animal> animales;

    public Zona () {}
    public Zona (String nombre) {
        this.nombre = nombre;
    }

    public void agregarAnimales (Animal animal1) {
        this.animales.add(animal1);
    }
    public int cantidadAnimales () {
        return this.animales.size();
    }
}
