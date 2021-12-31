package unidad1.tarea2;

import java.util.Scanner;

public class Ejercicio2_4 {

    public static void main(String[] args) {

        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca numero de millas");
        num1 = scanner.nextInt();
        num2 = num1 * 1609;
        System.out.println(num1 + " millas son: " + num2 + " metros");
    }
}

