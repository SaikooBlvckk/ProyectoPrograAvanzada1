//import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
//import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap <String, Evento> ubicaciones  = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i ++){
            System.out.println("Nombre");
            String nombre = sc.nextLine();
            System.out.println("TipoEv");
            String tipoEvento = sc.nextLine();
            System.out.println("ubi");
            String ubicacion = sc.nextLine();
            System.out.println("TipoEn");
            String tipoEntrada = sc.nextLine();
            System.out.println("Ciopre");
            int precio = sc.nextInt();
            System.out.println("Sto");
            int stock = sc.nextInt();
            Evento evento = new Evento(nombre,tipoEvento);

            evento.agregarEntrada(precio, tipoEntrada, stock);
            ubicaciones.put(ubicacion, evento);
            sc.nextLine();
        }

        for (HashMap.Entry<String, Evento> entry : ubicaciones.entrySet()){
            entry.getValue().imprimirEntradas();
        }
        
        for (int i = 0; i < 2; i++){
            String ubicacion = sc.nextLine();
            imprimirEntradas(ubicacion, ubicaciones);
        }

        sc.close();
    }

    public static void imprimirEntradas(String ubicacion, HashMap <String, Evento>ubicaciones){
        if (ubicaciones.containsKey(ubicacion)){
            System.out.println("En la ubicacion: " + ubicacion + " se consiguen las siguientes entradas:");
            ubicaciones.get(ubicacion).imprimirEntradas();
        }   
    }
}