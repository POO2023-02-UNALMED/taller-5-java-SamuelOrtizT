package zooAnimales;
import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal () {totalAnimales++;}
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
    public static String totalPorTipo () {
        return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: "
         + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios();}

    public String toString () {
        if (this.zona == null) {
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " +
        this.genero;
        }
        else {
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " +
        this.genero+ ", la zona en la que me ubico es " + this.zona.getNombre() + ", en el " + this.zona.getZoo().getNombre();
        }
    }
    public static int getTotalAnimales () {
        return totalAnimales;
    }
    public static void setTotalAnimales (int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }
    public String getNombre () {
        return this.nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public int getEdad () {
        return this.edad;
    }
    public void setEdad (int edad) {
        this.edad = edad;
    }
    public String getHabitat () {
        return this.habitat;
    }
    public void setHabitat (String habitat) {
        this.habitat = habitat;
    }
    public String getGenero () {
        return this.genero;
    }
    public void setGenero (String genero) {
        this.genero = genero;
    }
    public Zona getZona () {
        return this.zona;
    }
    public void setZona (Zona zona) {
        this.zona = zona;
    }
}
