public class Tarea {
    String descripcion;
    String prioridad;

    Tarea(String descripcion, String prioridad){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }
    public String toString() {
        return "(" + prioridad + ")" + descripcion;
    }
}