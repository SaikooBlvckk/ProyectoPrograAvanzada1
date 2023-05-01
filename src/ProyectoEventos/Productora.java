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

    public Evento mostrarEventos(String nombre){
        return (Evento)eventos.get(nombre);
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

    // Funcion que te recomienda la entrada
}

