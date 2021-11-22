//Diseñar una  función a la que se le pasen dos enteros
//y muestre todos los números comprendidos entre ellos.
package Ejercicios.unidad3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int numeroInicio, numeroFin;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        numeroInicio = scanner.nextInt();

        System.out.println("Introduce el segundo número");
        numeroFin = scanner.nextInt();

        comprendidosEntre(numeroInicio, numeroFin);

    }

    static void comprendidosEntre(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);

        }



    }
}
