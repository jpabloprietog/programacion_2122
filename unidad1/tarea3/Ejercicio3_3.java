package unidad1.tarea3;

import java.util.Scanner;

public class Ejercicio3_3 {

    public static void main(String[] args) {

        double num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Intruduzca Dividendo:");
        num1 = scanner.nextDouble();
        System.out.println("Intruduzca Divisor:");
        num2 = scanner.nextDouble();
        double num3 = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + num3);
    }
}
