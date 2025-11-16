import java.util.Scanner;

public class Main {
  // Método que devuelve si la edad es >= 18
  static boolean esMayorDeEdad(int edad) {
    return edad >= 18;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("¿Cuál es tu nombre? ");
    String nombre = sc.nextLine();

    System.out.print("¿Cuántos años tienes? ");
    // leer int. Atención: si luego lees nextLine() sería necesario limpiar el buffer
    int edad = sc.nextInt();
    sc.nextLine(); // consume el salto de línea pendiente (buena práctica si luego lees línea)

    System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

    if (esMayorDeEdad(edad)) {
      System.out.println("Eres mayor de edad.");
    } else {
      System.out.println("No eres mayor de edad.");
    }

    // pequeño uso de loop: contar hacia atrás hasta 0
    System.out.println("Contemos hacia atrás desde tu edad (máx 10 pasos):");
    int pasos = 0;
    while (edad > 0 && pasos < 10) {
      System.out.println(edad);
      edad--;
      pasos++;
    }

    sc.close();
    System.out.println("¡Gracias por participar!");
  }
}
