// Escribir una función que decida si dos números enteros positivos son amigos.
// Dos números son amigos si la suma de los divisores propios (distinto de él mismo)
// del primer número es igual al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)

package Ejercicios.unidad3;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número");
        num1 = scanner.nextInt();

        System.out.println("Introduzca el segundo número");
        num2 = scanner.nextInt();

        if (fsonamigos(num1, num2)) {
            System.out.println(num1 + " y " + num2 + " son amigos");
        } else {
            System.out.println(num1 + " y " + num2 + " no son amigos");
        }
    }

    public static boolean fsonamigos(int num1, int num2) {
        return fsumadivisores(num1) == num2 && fsumadivisores(num2) == num1;
    }

    public static int fsumadivisores(int num) {
        int sumadivisores = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumadivisores = sumadivisores + i;
            }
        }
        return sumadivisores;
    }
}