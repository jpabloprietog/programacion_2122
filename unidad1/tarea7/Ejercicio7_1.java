//Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.

package unidad1.tarea7;

import java.util.Scanner;

public class Ejercicio7_1 {

    public static void main(String[] args) {


        int a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número entero");
        a = scanner.nextInt();

        System.out.println("Introduce el segundo número entero");
        b = scanner.nextInt();

        a = b;
        b = a;

        System.out.println(a);
        System.out.println(b);
    }
}
