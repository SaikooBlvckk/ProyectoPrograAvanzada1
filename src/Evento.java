import java.util.HashMap;
import java.util.Map;

public class Evento {
    private HashMap <String, Entrada> entradas; // Entradas
    private String nombre;
    private String tipoEvento;

    public Evento(String nombre, String tipoEvento) {
        this.nombre = nombre;
        this.tipoEvento = tipoEvento;
        this.entradas = new HashMap<>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTipoEvento(){
        return this.tipoEvento;
    }

    public void setTipoEvento(String tipoEvento){
        this.tipoEvento = tipoEvento;
    }

    public void agregarEntrada(int precio, String tipoEntrada, int stock){
        Entrada entrada = new Entrada(precio, tipoEntrada, stock);
        this.entradas.put(tipoEntrada, entrada);
    }

    public void imprimirEntradas(){
        for (Map.Entry<String, Entrada> entry : this.entradas.entrySet()){
            Entrada value = entry.getValue();
            System.out.println("El tipo de entrada es: " + value.getTipo() + ", tiene un valor de: " + value.getPrecio() + " y quedan: " + value.getStock() + " entradas.");
        }
    }

    
}