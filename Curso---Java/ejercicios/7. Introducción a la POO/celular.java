class Celular {
    String marca;
    String modelo;
    String color;

    void prender() {
        System.out.println("El celular está encendido.");
    }

    void apagar() {
        System.out.println("El celular se apagó.");
    }
}

public class Main {
    public static void main(String[] args) {
        Celular miCelular = new Celular();
        miCelular.marca = "Samsung";
        miCelular.modelo = "Galaxy A10";
        miCelular.color = "Azul";

        miCelular.prender();
        miCelular.apagar();
    }
}
