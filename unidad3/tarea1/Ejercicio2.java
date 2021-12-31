// Diseñar una función a la que se le pasen dos enteros y muestre todos los números comprendidos
// entre ellos.

package unidad3.tarea1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número");
        int numInicio = scanner.nextInt();

        System.out.println("Introduzca el segundo número");
        int numFin = scanner.nextInt();

        comprendidosEntre(numInicio, numFin);
    }

    static void comprendidosEntre(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
}
