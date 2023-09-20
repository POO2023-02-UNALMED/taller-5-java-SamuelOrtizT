package zooAnimales;
import java.util.List;

public class Reptil extends Animal{
    private static List<Reptil> listado;
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
    public Reptil crearIguana (String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }
    public Reptil crearSerpiente (String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
}
}