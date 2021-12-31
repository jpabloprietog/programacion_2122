//Escribe un programa que ordene tres números enteros introducidos por teclado.

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_12 {

    public static void main(String[] args) {

        int numero1, numero2, numero3;
        int orden;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tres numeros por teclado y pulsa intro");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        numero3 = scanner.nextInt();

        //Se ordenan los dos primeros números.
        if (numero1 > numero2) {
            orden = numero1;
            numero1 = numero2;
            numero2 = orden;
        }
        //Se ordenan los dos ultimos números.
        if (numero2 > numero3) {
            orden = numero2;
            numero2 = numero3;
            numero3 = orden;
        }
        //Vuelven a ordenarse los dos primeros números para ordenarlos de menor a mayor;
        if (numero1 > numero2) {
            orden = numero1;
            numero1 = numero2;
            numero2 = orden;
        }
        System.out.println("Los números introducidos ordenados de menor a mayor son " + numero1 + ", " + numero2 + " y " + numero3 + ".");
    }
}

