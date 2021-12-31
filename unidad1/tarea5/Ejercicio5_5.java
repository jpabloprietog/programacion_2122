//Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.

package unidad1.tarea5;

import java.util.Scanner;

public class Ejercicio5_5 {

    public static void main(String[] args) {

        long num1, num2, num3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        num1 = scanner.nextLong();

        System.out.println("Introduce el segundo número");
        num2 = scanner.nextLong();

        System.out.println("Introduce el tercer número");
        num3 = scanner.nextLong();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es mayor");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es mayor");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " es mayor");
        }
    }
}
