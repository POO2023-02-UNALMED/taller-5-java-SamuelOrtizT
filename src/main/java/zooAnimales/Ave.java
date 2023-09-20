package zooAnimales;
import java.util.List;

public class Ave extends Animal{
    private static List<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave () {listado.add(this);}
    public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }
    public static int cantidadAves() {
        return listado.size();
    }
    public String movimiento () {
        return "volar";
    }
    public Ave crearHalcon (String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    }
    public Ave crearAguila (String nombre, int edad, String habitat, String genero, String colorPlumas) {
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }
}
