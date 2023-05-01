package ProyectoEventos;

import java.util.HashMap;

public class VentaEntradas {
    private HashMap<String, Evento> eventos;

    public VentaEntradas() {
        eventos = new HashMap<>();
    }

    public void agregarEvento(String nombre, String fecha, int stock, String area) {
        if (eventos.containsKey(nombre)) {
            throw new IllegalArgumentException("El evento ya existe.");
        }
        Evento evento = new Evento(nombre, fecha, stock, area);
        eventos.put(nombre, evento);
    }

    public void agregarEntrada(String nombreEvento, String tipo, int precio, int stock) {
        if (!eventos.containsKey(nombreEvento)) {
            throw new IllegalArgumentException("El evento no existe.");
        }
        try {
            Evento evento = eventos.get(nombreEvento);
            Entrada tipoEntrada = new Entrada(precio, tipo, stock);
            evento.addEntradas(tipoEntrada);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarEventos() {
        for (HashMap.Entry<String, Evento> entry : eventos.entrySet()) {
            System.out.println("Evento: " + entry.getValue().getNombre());
            System.out.println("Fecha: " + entry.getValue().getFecha());
            System.out.println("Tipos de Entrada: ");
            for (Entrada entrada : entry.getValue().getEntradas()) {
                System.out.println(" - " + entrada.getTipo() + ": " + entrada.getPrecio());
            }
        }
    } 
}
