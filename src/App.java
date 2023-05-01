import ProyectoEventos.*;
import Ventanas.Carga;

public class App {

    public static void main(String[] args) throws Exception{
        Productora productora = new Productora();
        Carga carga = new Carga(productora);
        carga.setVisible(true);
    }
    
}