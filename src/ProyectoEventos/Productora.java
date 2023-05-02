/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeventos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author javii
 */
public class Productora {
    private HashMap<String, Eventos> evento;

    public Productora() {
        evento = new HashMap();
    }
    
    public boolean agregarEvento(Eventos eventos){
        if (!evento.containsKey(eventos.getNombre())) {
            evento.put(eventos.getNombre(), eventos);
            return true;
        } else {
            return false;
        }
    }
    
    public Eventos obtenerEvento(String nombre) {
        return evento.get(nombre);
    }
    
    public void modificarEvento(String nombre, Eventos eventoNuevo) {
        evento.put(nombre, eventoNuevo);
    }
    
    public void mostrarEventos(){
        for (HashMap.Entry<String, Eventos> entry : evento.entrySet()) {
            System.out.println("Evento: " + entry.getValue().getNombre());
            System.out.println("Fecha: " + entry.getValue().getFecha());
            System.out.println("Stock: " + entry.getValue().getStock());
            System.out.println("Area " + entry.getValue().getArea());
            for (Entradas entrada : entry.getValue().getEntradas()) {
                System.out.println(" - " + entrada.getTipo() + ": " + entrada.getPrecio());
            }
        }
    }
    
    public boolean eliminarEvento(String nombre) {
        if (evento.containsKey(nombre)) {
            evento.remove(nombre);
            return true;
        } else {
            return false;
        }
    }
    
    //IMPLEMENTAR ESTE O IMPLEMENTAR FUNCION SUGERIR
    public ArrayList<Eventos> filtrarEventosPorFecha(LocalDate fechaInicio, LocalDate fechaFin) {
        ArrayList<Eventos> eventosFiltrados = new ArrayList<>();
    
        for (Eventos evento : evento.values()) {
            LocalDate fechaEvento = LocalDate.parse(evento.getFecha());
    
            if (fechaEvento.isEqual(fechaInicio) || fechaEvento.isEqual(fechaFin) ||
                    (fechaEvento.isAfter(fechaInicio) && fechaEvento.isBefore(fechaFin))) {
                eventosFiltrados.add(evento);
            }
        }
        return eventosFiltrados;
    }

    public HashMap<String, Eventos> getEvento() {
        return evento;
    }

    public void setEvento(HashMap<String, Eventos> evento) {
        this.evento = evento;
    }  
}
