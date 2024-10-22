import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tarea> ListaTareas = new ArrayList<>();
        ListaTareas.add(new Tarea(descripcion:"Realizar investigacion para el proyecto", prioridad: "Alta"));
        ListaTareas.add(new Tarea(descripcion:"Completar informe mensual", prioridad: "Media"));
        ListaTareas.add(new Tarea(descripcion:"Coordinar reunión con el equipo", prioridad: "Baja"));
        ListaTareas.add(new Tarea(descripcion:"Actualizar la base de datos de clientes", prioridad: "Alta"));
        ListaTareas.add(new Tarea(descripcion:"Preparar presentacion para el cliente", prioridad: "Media"));

        Collections.sort(ListaTareas, Comparator.comparing(tarea -> tarea.prioridad));

        for (Tarea tarea : ListaTareas){
            System.out.println(tarea);
        }
    }
}