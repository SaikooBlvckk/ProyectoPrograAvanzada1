package ProyectoEventos;

import java.util.HashMap;
import java.time.LocalDate;
import java.util.ArrayList;

public class Productora {
    private HashMap<String, Evento> eventos;

    public Productora() {
        eventos = new HashMap<String, Evento>();
    }

    public boolean agregarEvento(Evento evento) {
        if (!eventos.containsKey(evento.getNombre())) {
            eventos.put(evento.getNombre(), evento);
            return true;
        } else {
            return false;
        }
    }

    public Evento obtenerEvento(String nombre) {
        return eventos.get(nombre);
    }

    public boolean eliminarEvento(String nombre) {
        if (eventos.containsKey(nombre)) {
            eventos.remove(nombre);
            return true;
        } else {
            return false;
        }
    }

    public void modificarEvento(String nombreAntiguo, Evento eventoNuevo) {
        eventos.put(nombreAntiguo, eventoNuevo);
    }

    public void mostrarEventos() {
        for (HashMap.Entry<String, Evento> entry : eventos.entrySet()) {
            System.out.println("Evento: " + entry.getValue().getNombre());
            System.out.println("Fecha: " + entry.getValue().getFecha());
            System.out.println("Stock: " + entry.getValue().getStock());
            System.out.println("Area " + entry.getValue().getArea());
            for (Entrada entrada : entry.getValue().getEntradas()) {
                System.out.println(" - " + entrada.getTipo() + ": " + entrada.getPrecio());
            }
        }
    } 

    public ArrayList<Evento> filtrarEventosPorFecha(LocalDate fechaInicio, LocalDate fechaFin) {
        ArrayList<Evento> eventosFiltrados = new ArrayList<>();
    
        for (Evento evento : eventos.values()) {
            LocalDate fechaEvento = LocalDate.parse(evento.getFecha());
    
            if (fechaEvento.isEqual(fechaInicio) || fechaEvento.isEqual(fechaFin) ||
                    (fechaEvento.isAfter(fechaInicio) && fechaEvento.isBefore(fechaFin))) {
                eventosFiltrados.add(evento);
            }
        }
        return eventosFiltrados;
    }

    public Entrada buscarTipoEntrada(String nombreEvento, String tipo) {
        Evento evento = eventos.get(nombreEvento);
        if (evento != null) {
            for (Entrada tipoEntrada : evento.getEntradas()) {
                if (tipoEntrada.getTipo().equals(tipo)) {
                    return tipoEntrada;
                }
            }
        }
        return null;
    }

    // Funcion que te recomienda la entrada
}

