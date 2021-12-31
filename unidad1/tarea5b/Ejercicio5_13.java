//Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_13 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero por teclado");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El númeto " + numero + " es impar.");
        }
        if (numero % 5 == 0) {
            System.out.println("El numero " + numero + " es divisible entre 5.");
        } else {
            System.out.println("El numero " + numero + " no es divisible entre 5.");
        }
    }
}
