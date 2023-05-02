/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeventos;

/**
 *
 * @author javii
 */
public class Entradas {
    private int precio;
    private String tipo;
    private int stock;
    

    public Entradas(int precio, String tipo, int stock) {
        this.precio = precio;
        this.tipo = tipo;
        this.stock = stock;
    }
    
    public Entradas(String tipo, int stock) {
        this.tipo = tipo;
        this.stock = stock;
        this.precio = 0;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio <= 0){
            throw new IllegalArgumentException("El precio debe ser mayor a 0");
        }
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    
}
