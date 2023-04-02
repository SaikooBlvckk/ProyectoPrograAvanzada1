public class Entrada{
    
    private int precio;
    private String tipoEntrada;
    private int stock;

    public Entrada(int precio, String tipoEntrada, int stock){
        this.precio = precio;
        this.tipoEntrada = tipoEntrada;
        setStock(stock);
    }

    public int getPrecio(){
        return this.precio;
    }

    public void setPrecio(int precio){
        if (precio >= 0)
            this.precio = precio;
        else{
            System.out.println("No se puede asignar un numero negativo al precio");
        }
    }

    public String getTipo(){
        return this.tipoEntrada;
    }

    public void setTipo(String tipoEntrada){
        this.tipoEntrada = tipoEntrada;
    }

    public int getStock(){
        return this.stock;
    }

    public void setStock(int stock){
        if (stock >= 0)
            this.stock = stock;
        else{
            System.out.println("No se puede asignar un numero negativo de entradas");
        }
    }

}
