public class Entrada {
    private Evento evento;
    private int precio;
    private String tipoEntrada;
    private int stock;

    public Entrada(Evento evento, int precio, String tipoEntrada, int stock){
        this.evento = evento;
        this.precio = precio;
        this.tipoEntrada = tipoEntrada;
        setStock(stock);
    }

    public Evento getEvento(){
        return this.evento;
    }

    public void setEvento(Evento evento){
        this.evento = evento;
    }

    public int getPrecio(){
        return this.precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
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
