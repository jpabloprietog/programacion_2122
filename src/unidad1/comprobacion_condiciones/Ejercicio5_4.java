//Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.
//(ctrl + alt + l) -> Dar Formato al código.
package unidad1.comprobacion_condiciones;

import java.util.Scanner;

public class Ejercicio5_4 {

    public static void main(String[] args) {

        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero entero");
        num1 = scanner.nextInt();
        System.out.println("Introduce otro número entero");
        num2 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El numero " + num1 + " es par");
        }
        if (num2 % 2 == 0) {
            System.out.println("El numero " + num2 + " es par");
        }
    }
}
