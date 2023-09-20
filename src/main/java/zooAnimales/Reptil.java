package zooAnimales;
import java.util.List;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static List<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil () {listado.add(this);}
    public Reptil (String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public static int cantidadReptiles () {
        return listado.size();
    }
    public String movimiento () {
        return "reptar";
    }
    public static Reptil crearIguana (String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }
    public static Reptil crearSerpiente (String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
}
public static List<Reptil> getListado () {
    return Reptil.listado;
}
public static void setListado (List<Reptil> listado) {
    Reptil.listado = listado;
}
public static int getIguanas () {
    return Reptil.iguanas;
}
public static void setIguanas (int iguanas) {
    Reptil.iguanas = iguanas;
}
public static int getSerpientes () {
    return Reptil.serpientes;
}
public static void setSerpientes (int serpientes) {
    Reptil.serpientes = serpientes;
}
public String getColorEscamas () {
    return this.colorEscamas;
}
public void setColorEscamas (String colorEscamas) {
    this.colorEscamas = colorEscamas;
}
public int getLargoCola () {
    return this.largoCola;
}
public void setLargoCola (int largoCola) {
    this.largoCola = largoCola;
}
}