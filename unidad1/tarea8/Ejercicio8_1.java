//Diseñar un programa que muestre, para cada número introducido por teclado, si es par,
//si es positivo, y su cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_1 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce un número, para finalizar introduce 0");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " es par");
            } else {
                System.out.println(numero + " no es par");
            }
            if (numero > 0) {
                System.out.println(numero + " es positivo");
            } else {
                System.out.println(numero + " es negativo");
            }
            double exponente = numero;
            System.out.println("El cuadrado de " + numero + " es " + numero * exponente);
        } while (numero != 0);
    }
}


