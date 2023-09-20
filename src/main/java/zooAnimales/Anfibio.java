package zooAnimales;
import java.util.List;

public class Anfibio extends Animal{
    private static List<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio () {listado.add(this);}
    public Anfibio (String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public static int cantidadAnfibios () {
        return listado.size();
    }
    public String movimiento () {
        return "saltar";
    }
    public Anfibio crearRana (String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }
    public Anfibio crearSalamandra (String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }
    public static List<Anfibio> getListado () {
        return Anfibio.listado;
    }
    public static void setListado (List<Anfibio> listado) {
        Anfibio.listado = listado;
    }
    public static int getRanas () {
        return Anfibio.ranas;
    }
    public static void setRanas (int ranas) {
        Anfibio.ranas = ranas;
    }
    public static int getSalamandras () {
        return Anfibio.salamandras;
    }
    public static void setSalamandras (int salamandras) {
        Anfibio.salamandras = salamandras;
    }
    public boolean getVenenoso () {
        return this.venenoso;
    }
    public void setVenenoso (boolean venenoso) {
        this.venenoso = venenoso;
    }
    public String getColorPiel () {
        return this.colorPiel;
    }
    public void setColorPiel (String colorPiel) {
        this.colorPiel = colorPiel;
    }
}
