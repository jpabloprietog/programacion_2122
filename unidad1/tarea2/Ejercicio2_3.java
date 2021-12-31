package unidad1.tarea2;

import java.util.Scanner;

public class Ejercicio2_3 {

    public static void main(String[] args) {

        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        num1 = scanner.nextInt();

        System.out.println("Introduzca el siguiente numero");
        num2 = scanner.nextInt();

        System.out.println("la división de los dos numeros es: " + num1 / num2);
    }
}
