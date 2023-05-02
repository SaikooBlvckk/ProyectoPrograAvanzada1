package ProyectoEventos;
import java.util.ArrayList;

public class Evento {
    private String nombre;
    private String fecha;
    private int stock;
    private String area;
    private ArrayList<Entrada> entradas;

    public Evento(String nombre, String fecha, int stock, String area) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.stock = stock;
        this.area = area;
        this.entradas = new ArrayList<>();
    }

    public Evento(String nombre, String fecha, int stock, String area, Entrada entrada) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.stock = stock;
        this.area = area;
        this.entradas = new ArrayList<>();
        this.entradas.add(entrada);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public ArrayList<Entrada> getEntradas() {
        return this.entradas;
    }
    
    public void addEntradas(Entrada entrada) {
        this.entradas.add(entrada);
    }
    
}