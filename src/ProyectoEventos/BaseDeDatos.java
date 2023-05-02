package ProyectoEventos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BaseDeDatos {
    private String nombreArchivo;
    private HashMap<String, Evento> eventos;

    public BaseDeDatos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.eventos = new HashMap<>();
    }

    public void cargar() throws IOException {
        File archivo = new File(nombreArchivo);
        Scanner scanner = new Scanner(archivo);
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] datos = linea.split(",");
            String nombre = datos[0];
            String fecha = datos[1];
            int stock = Integer.parseInt(datos[2]);
            String tipo = datos[3];
            Evento evento = new Evento(nombre, fecha, stock, tipo);
            eventos.put(evento.getNombre(),evento);
        }
        scanner.close();
    }

    public void grabar() throws IOException {
        FileWriter writer = new FileWriter(nombreArchivo);
        for (HashMap.Entry<String, Evento> entry : eventos.entrySet()) { // Iterando sobre HashMap
            Evento evento = entry.getValue();
            String linea = evento.getNombre() + "," + evento.getFecha() + "," + evento.getStock() + ","
                    + evento.getEntradas() + "\n";
            writer.write(linea);
        }
        writer.close();
    }
    

    public void agregarEvento(Evento evento) {
        eventos.put(evento.getNombre(),evento);
    }

    public HashMap<String,Evento> getEventos() {
        return eventos;
    }
}


