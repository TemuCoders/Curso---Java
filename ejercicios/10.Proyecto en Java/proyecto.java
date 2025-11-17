import java.util.ArrayList;
import java.util.Scanner;

class Tarea{
    private int _id;
    private String _nombre;
    private String _descripcion;
    private boolean _completado;

    public Tarea(int id, String nombre, String descripcion){
        this._id= id;
        this._nombre= nombre;
        this._descripcion= descripcion;
        this._completado= false;
    }

    //geter
    public  int getId(){
        return this._id;
    }

    public String getNombre(){
        return this._nombre;
    }

    public String getDescripcion(){
        return this._descripcion;
    }

    public boolean isCompletado(){
        return this._completado;
    }

    //setters

    public void setDescripcion(String desc){
        this._descripcion= desc;
    }

    public void setNombre(String nombre){
        this._nombre= nombre;
    }

    public void marcarComoCompletado(){
        this._completado= true;
    }

    public void mostrarInformacion(){
        System.out.println("ID: "+ this._id);
        System.out.println("Nombre: "+ this._nombre);
        System.out.println("Descripcion: "+ this._descripcion);
        System.out.println("Estado: "+ this._completado);
    }
}

class GestorDeTareas {
    private ArrayList<Tarea> tareas = new ArrayList<>();
    private int contadorId = 1;

    public void crearTarea(String nombre, String Descripcion){
        Tarea tarea = new Tarea(contadorId++,nombre,Descripcion);
        tareas.add(tarea);
    }

    public void listarTareas(){
        if(tareas.isEmpty()){
            System.out.println("No hay tareas disponibles");
            return;
        }else{
            for(Tarea t: tareas){

                t.mostrarInformacion();
            }
        }
    }

    public void editarTarea(int id, String nuevoNombre,String nuevaDescripcion){
        for(Tarea t: tareas){
            if(t.getId() == id){
                t.setNombre(nuevoNombre);
                t.setDescripcion(nuevaDescripcion);
                System.out.println("tarea actualizada");
                return;
            }

        }
        System.out.println("Tarea no encontrada");
    }

    public void borrarTarea(int id){
        tareas.removeIf(t->t.getId()== id);
        System.out.println("La tarea si existia y fue eliminada");
    }


}

public class Main
{
    public static void main(String[] args) {

        GestorDeTareas gestor = new GestorDeTareas();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== ADMINISTRADOR DE TAREAS ===");
            System.out.println("1. Crear tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Editar tarea");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Título: ");
                String titulo = sc.nextLine();
                System.out.print("Descripción: ");
                String desc = sc.nextLine();
                gestor.crearTarea(titulo, desc);

            } else if (op == 2) {
                gestor.listarTareas();

            } else if (op == 3) {
                System.out.print("ID: ");
                int id = sc.nextInt(); sc.nextLine();
                System.out.print("Nuevo título: ");
                String titulo = sc.nextLine();
                System.out.print("Nueva descripción: ");
                String desc = sc.nextLine();
                gestor.editarTarea(id, titulo, desc);

            } else if (op == 4) {
                System.out.print("ID: ");
                int id = sc.nextInt(); sc.nextLine();
                gestor.borrarTarea(id);

            } else if (op == 5) {
                break;
            }
        }

    }
}