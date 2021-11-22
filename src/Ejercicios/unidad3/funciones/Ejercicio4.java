//Diseñar una función que reciba como parámetros dos números enteros
//y que devuelva el mayor de los dos.
package Ejercicios.unidad3.funciones;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int numero1, numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        numero1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el segundo número");
        numero2 = scanner.nextInt();

        System.out.println("El mayor es " + fMayor(numero1, numero2));
    }

    static int fMayor(int numero1, int numero2) {
        return numero1 > numero2 ? numero1 : numero2;

    }
}
