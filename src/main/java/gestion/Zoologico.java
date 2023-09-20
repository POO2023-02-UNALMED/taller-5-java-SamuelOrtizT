package gestion;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas;

    public Zoologico () {}
    public Zoologico (String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas (Zona zona1) {
        this.zonas.add(zona1);
    }
    public int cantidadTotalAnimales () {
        
        return,
    }
}
