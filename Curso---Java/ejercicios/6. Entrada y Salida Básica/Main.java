// IOExample.java
// Ejemplo práctico de entrada/salida usando Scanner.
// Muestra cómo leer texto y números, validar y evitar el problema de nextInt() seguido de nextLine().

import java.util.Scanner;

public class IOExample {
  public static void main(String[] args) {
    // Creamos Scanner para leer de la consola
    Scanner sc = new Scanner(System.in);

    System.out.print("¿Cuál es tu nombre? ");
    String nombre = sc.nextLine(); // lee una línea completa (permite espacios)

    System.out.print("¿Cuántos años tienes? ");
    // Validamos que el usuario escriba un entero antes de leerlo
    int edad;
    if (sc.hasNextInt()) {
      edad = sc.nextInt(); // leer entero
      sc.nextLine(); // consumir el salto de línea pendiente (muy importante si luego usamos nextLine)
    } else {
      // Si no escribió un entero, avanzamos y ponemos un valor por defecto
      System.out.println("No ingresaste un número válido. Tomaré 0 años por defecto.");
      sc.nextLine(); // limpiar token inválido
      edad = 0;
    }

    System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

    // Uso de un método (visto en el curso) para decidir si es mayor de edad
    if (esMayorDeEdad(edad)) {
      System.out.println("Eres mayor de edad.");
    } else {
      System.out.println("No eres mayor de edad.");
    }

    // Pequeño loop que cuenta regresivo desde la edad hasta 0 (máx 10 pasos)
    System.out.println("Contemos hacia atrás (máx 10 pasos):");
    int pasos = 0;
    while (edad > 0 && pasos < 10) {
      System.out.println(edad);
      edad--;
      pasos++;
    }

    System.out.println("¡Gracias por participar!");
    sc.close(); // cerramos Scanner porque terminamos de leer
  }

  // Método sencillo usado en este ejemplo
  static boolean esMayorDeEdad(int edad) {
    return edad >= 18;
  }
}
