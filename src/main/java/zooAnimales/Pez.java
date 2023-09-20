package zooAnimales;
import java.util.List;
import java.util.ArrayList;

public class Pez extends Animal{
    private static List<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez () {listado.add(this);}
    public Pez (String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public static int cantidadPeces () {
        return listado.size();
    }
    public String movimiento () {
        return "nadar";
    }
    public static Pez crearSalmon (String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    }
    public static Pez crearBacalao (String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6);
    }
    public static List<Pez> getListado () {
        return Pez.listado;
    }
    public static void setListado (List<Pez> listado) {
        Pez.listado = listado;
    }
    public static int getSalmones () {
        return Pez.salmones;
    }
    public static void setSalmones (int salmones) {
        Pez.salmones = salmones;
    }
    public static int getBacalaos () {
        return Pez.bacalaos;
    }
    public static void setBacalaos (int bacalaos) {
        Pez.bacalaos = bacalaos;
    }
    public String getColorEscamas () {
        return this.colorEscamas;
    }
    public void setColorEscamas (String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    public int getCantidadAletas () {
        return this.cantidadAletas;
    }
    public void setCantidadAletas (int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
