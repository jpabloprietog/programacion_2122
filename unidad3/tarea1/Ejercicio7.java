// Diseñar una función que nos diga si un número es primo.

package unidad3.tarea1;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int num = scanner.nextInt();

        if (fEsPrimo(num)) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " NO es primo");
        }
    }

    public static boolean fEsPrimo(int num) {

        boolean esPrimo = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}
