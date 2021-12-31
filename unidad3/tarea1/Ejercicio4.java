// Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los
// dos.

package unidad3.tarea1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduzca el segundo número");
        int num2 = scanner.nextInt();

        System.out.println("El mayor es " + fMayor(num1, num2));
    }

    static int fMayor(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}
