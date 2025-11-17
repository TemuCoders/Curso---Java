class Amigo {
    String nombre;
    int edad;

    Amigo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

public class Main {
    public static void main(String[] args) {
        Amigo[] amigos = {
            new Amigo("Valeria", 15),
            new Amigo("Diego", 16),
            new Amigo("Sofía", 14)
        };

        System.out.println("Lista de amigos:");
        for (Amigo a : amigos) {
            a.saludar();
        }
    }
}

