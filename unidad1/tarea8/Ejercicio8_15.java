//Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos.
//Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número");
        numero = scanner.nextInt();

        int primos = 0;

        for (int i = 2; i <= numero; i++) {
            int divisible = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisible++;
                    if (divisible > 2) {
                        break;
                    }
                }
            }
            if (divisible == 2) {
                System.out.println(i + "-> es primo");
                primos++;
            } else {
                System.out.println(i + "-> no es primo");
            }
        }
        System.out.println("Entre 1 y " + numero + " hay " + primos + " numeros primos");
    }
}
