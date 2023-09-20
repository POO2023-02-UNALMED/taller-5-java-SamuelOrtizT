package zooAnimales;
import java.util.List;
import java.util.ArrayList;
import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private static List<Zona> zona = new ArrayList<>(1);

    public Animal () {}
    public Animal (String nombre, int edad, String habitat, String genero) {
        totalAnimales++;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }
    public String movimiento () {
        return "desplazarse";
    }
    public String totalPorTipo () {
        return "Mamiferos: " + cantidadMamiferos + ;
    }
    public String toString () {
        return "Mi nombre es" + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " +
        this.genero+ ", la zona en la que me ubico es " + this.zona + ", en el " + this.zoo
    }
}
