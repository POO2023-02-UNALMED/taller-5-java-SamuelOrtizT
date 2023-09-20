package gestion;
import java.util.List;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas = new ArrayList<>();

    public Zoologico () {}
    public Zoologico (String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas (Zona zona1) {
        this.zonas.add(zona1);
    }
    public int cantidadTotalAnimales () {
        int a = 0;
        for (Zona zona : zonas) {
            a += zona.cantidadAnimales();
        }
        return a;
    }
    public String getNombre () {
        return this.nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion () {
        return this.ubicacion;
    }
    public void setUbicacion (String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public List<Zona> getZona () {
        return this.zonas;
    }
    public void setZona (List<Zona> zonas) {
        this.zonas = zonas;
    }
}
