/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeventos;

import java.util.ArrayList;

/**
 *
 * @author javii
 */
public class Eventos {
    private String nombre;
    private String fecha;
    private int stock;
    private String area;
    private ArrayList<Entradas> entradas;

    public Eventos(String nombre, String fecha, int stock, String area) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.stock = stock;
        this.area = area;
        this.entradas = new ArrayList();
    }
    
    public Eventos(String nombre, String fecha, int stock, String area, Entradas entrada) {
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

    public ArrayList<Entradas> getEntradas() {
        return entradas;
    }

    public void setEntradas(Entradas entradas) {
        this.entradas.add(entradas);
    }

    

    
    
    
}
