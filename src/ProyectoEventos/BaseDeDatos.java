package ProyectoEventos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BaseDeDatos {
    /***
    private String nombreArchivo;
    private HashMap<String, Eventos> eventos;

    public BaseDeDatos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        eventos = new HashMap();
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
            String entradas = datos[4];  //ARRAY 
            Eventos evento = new Eventos(nombre, fecha, stock, tipo, entradas); //NO SE COMO SE AÑADE
            eventos.put(evento.getNombre(),evento);
        }
        scanner.close();
    }

    public void grabar() throws IOException {
        FileWriter writer = new FileWriter(nombreArchivo);
        for (Eventos evento : eventos) { //HASHMAP NO ARRAY
            String linea = evento.getNombre() + "," + evento.getFecha() + "," + evento.getStock() + ","
                    + evento.getTipoE() + "," + evento.getEntradas() + "\n";
            writer.write(linea);
        }
        writer.close();
    }

    public void agregarEvento(Eventos evento) {
        eventos.put(evento.getNombre(),evento);
    }

    public HashMap<String,Eventos> getEventos() {
        return eventos;
    }
    ***/
}


