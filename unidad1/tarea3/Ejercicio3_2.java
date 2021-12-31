package unidad1.tarea3;

import java.util.Scanner;

public class Ejercicio3_2 {

    public static void main(String[] args) {

        short num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Intruduce tu año de nacimiento");
        num1 = scanner.nextShort();
        System.out.println("Intruduce el año actual");
        num2 = scanner.nextShort();
        int num3 = num2 - num1;
        System.out.println("Tienes " + num3 + " años");
    }
}
