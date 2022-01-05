//Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
//El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores,
//por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.

package unidad1.tarea8b;

import java.util.Scanner;

public class Ejercicio8_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int primerTermino = 0;
        int segundoTermino = 1;
        int restoTermino;

        System.out.println("Introduce un número");
        n = scanner.nextInt();

        System.out.println(primerTermino + ", " + segundoTermino);

        for (int i = 2; i < n; i++) {

            restoTermino = primerTermino + segundoTermino;
            System.out.println(", " + restoTermino);

            primerTermino = segundoTermino;
            segundoTermino = restoTermino;

        }
    }
}
