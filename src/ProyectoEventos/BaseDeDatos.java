/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeventos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class BaseDeDatos {
    private String nombreArchivo;
    private String directorioActual;
    private String pathname;
    private HashMap<String, Eventos> eventos;

    public BaseDeDatos() {
        this.nombreArchivo = "events.csv";
        this.directorioActual = System.getProperty("user.dir");
        this.pathname = directorioActual + "/" + nombreArchivo;
        eventos = new HashMap();
    }

    public void cargar() throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(pathname);
            br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine())!= null){
                String[] datos = linea.split(",");
                String nombre = datos[0];
                String fecha = datos[1];
                int stock = Integer.parseInt(datos[2]);
                String area = datos[3]; 
                Eventos evento = new Eventos(nombre, fecha, stock, area);
                eventos.put(evento.getNombre(),evento);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try{
                if(fr!= null)
                    fr.close();
            }catch(Exception ex){
                    ex.printStackTrace();
            }
        }
    }

    public void grabar() throws IOException {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            for (HashMap.Entry<String, Eventos> entry : eventos.entrySet()) {
                Eventos evento = entry.getValue();
                String linea = evento.getNombre() + "," + evento.getFecha() + "," + evento.getStock() + ","
                        + evento.getEntradas() + "\n";
                writer.write(linea);
            }
        }
    }

    public void agregarEvento(Eventos evento) {
        eventos.put(evento.getNombre(),evento);
    }

    public HashMap<String,Eventos> getEventos() {
        return eventos;
    }
    
    
    
}


