package unidad1.tarea3;

import java.util.Scanner;

public class Ejercicio3_1 {

    public static void main(String[] args) {

        byte num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce primer numero a sumar");
        num1 = scanner.nextByte();
        System.out.println("Introduce segundo numero a sumar");
        num2 = scanner.nextByte();
        int num3 = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + num3);
    }
}
