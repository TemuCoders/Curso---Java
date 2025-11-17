public class Main {
    public static void main(String[] args) {
        String nombre = "Ana Torres";

        System.out.println("Longitud: " + nombre.length());
        System.out.println("Mayúsculas: " + nombre.toUpperCase());

        String[] partes = nombre.split(" ");
        System.out.println("Primer nombre: " + partes[0]);
        System.out.println("Apellido: " + partes[1]);
    }
}
