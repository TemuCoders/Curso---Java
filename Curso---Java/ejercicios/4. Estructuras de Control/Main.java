// ControlStructures.java
// Ejemplo sencillo para mostrar estructuras de control: if/else, switch, for, while, do-while, break y continue.
// Pega este archivo en un editor Java (por ejemplo Replit) y ejecútalo.

public class ControlStructures {
  public static void main(String[] args) {
    // 1) Condicionales (if / else)
    int edad = 16; // cambia este valor para ver diferentes resultados
    if (edad >= 18) {
      System.out.println("Tienes 18 años o más → Eres mayor de edad");
    } else {
      System.out.println("Tienes menos de 18 años → No eres mayor de edad");
    }

    // 2) switch-case (elegir entre opciones)
    int dia = 3; // 1=Lunes, 2=Martes, 3=Miercoles...
    switch (dia) {
      case 1:
        System.out.println("Hoy es Lunes");
        break;
      case 2:
        System.out.println("Hoy es Martes");
        break;
      case 3:
        System.out.println("Hoy es Miércoles");
        break;
      default:
        System.out.println("Es otro día de la semana");
        break;
    }

    // 3) for (cuando sabes cuántas veces repetir)
    System.out.println("For: contar del 1 al 5");
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }

    // 4) while (repetir mientras la condición sea verdadera)
    System.out.println("While: contar hacia abajo desde 3");
    int w = 3;
    while (w > 0) {
      System.out.println(w);
      w--; // actualizar la variable de control para evitar bucle infinito
    }

    // 5) do-while (ejecuta al menos una vez)
    System.out.println("Do-While: se ejecuta al menos una vez");
    int d = 0;
    do {
      System.out.println("Esto se imprime una vez aunque d sea 0");
      d++;
    } while (d < 0); // condición falsa, pero ya se ejecutó una vez

    // 6) break y continue
    System.out.println("break y continue en un for (imprime 1,2,4 y luego para en 6):");
    for (int k = 1; k <= 10; k++) {
      if (k == 3) {
        continue; // salta la impresión del 3 y sigue con el siguiente k
      }
      if (k == 6) {
        break; // sale del bucle por completo cuando k == 6
      }
      System.out.println(k);
    }

    System.out.println("Fin de ControlStructures");
  }
}
