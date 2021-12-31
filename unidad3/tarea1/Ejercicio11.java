// Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo.
// Realizar una versión iterativa y otra recursiva.

package unidad3.tarea1;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la base");
        int a = scanner.nextInt();

        System.out.println("Introduzca el exponente");
        int n = scanner.nextInt();

        System.out.println(a + " elevado a " + n + " es " + fElevarIterativa(a, n));

        System.out.println(a + " elevado a " + n + " es " + fElevarRecursiva(a, n));
    }

    static int fElevarIterativa(int b, int e) {
        if (e == 0) {
            return 1;
        } else {
            int resultado = b;
            for (int i = 1; i < e; i++) {
                resultado = resultado * b;
            }
            return resultado;
        }
    }

    static int fElevarRecursiva(int b, int e) {
        if (e == 1) {
            return b;
        } else if (e == 0) {
            return 1;
        } else {
            return fElevarRecursiva(b, e - 1) * b;
        }
    }
}
