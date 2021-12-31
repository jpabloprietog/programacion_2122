package unidad1.tarea2;

import java.util.Scanner;

public class Ejercicio2_5 {

    public static void main(String[] args) {

        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce temperatura en ªC");
        num1 = scanner.nextInt();
        num2 = ((9 * num1) / 5) + 32;
        System.out.println(num1 + "ºC son: " + num2 + "ºF");
    }
}
