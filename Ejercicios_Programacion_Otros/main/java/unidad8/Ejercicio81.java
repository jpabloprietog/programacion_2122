package unidad8;

import java.util.Scanner;

public class Ejercicio81 {

  public static void main(String[] args) {

    int numero;

    Scanner scanner = new Scanner(System.in);
    numero = scanner.nextInt();
    do {
      if (numero % 2 == 0) {
        System.out.print(numero + " es par ");
      } else {
        System.out.print(numero + "es impar");
      }
      if (numero > 0) {
        System.out.print("es positivo");

      } else if (numero < 0) {
        System.out.print("Es negativo");
      }
      System.out.println("El cuadrado es " + numero * numero + ".");
    } while (numero != 0);
  }
}
