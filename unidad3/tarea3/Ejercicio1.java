// Diseñar un programa que solicite al usuario 5 números decimales. A continuación, debe mostrar
// los números en el mismo orden en que se han introducido.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca 5 números decimales");
        double[] ar = new double[5];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextDouble();
        }
        System.out.println(Arrays.toString(ar));
    }
}
