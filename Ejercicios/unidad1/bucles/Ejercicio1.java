//Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo,
//y su cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.

package Ejercicios.unidad1.bucles;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduca los números uno a uno, para finalizar introduzca 0");

        do {
            num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " es par,");
            } else {
                System.out.println(num + " es impar,");
            }
            if (num > 0) {
                System.out.println(" es positivo");
            } else if (num < 0) {
                System.out.println(" es negativo");
            }
            System.out.println(" su cuadrado es " + num * num + ".");
        } while (num != 0);
    }
}
