package unidad1.tarea3;

import java.util.Scanner;

public class Ejercicio3_4 {

    public static void main(String[] args) {

        float num1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Intruduzca longitud en millas");
        num1 = scanner.nextFloat();
        double num2 = num1 * 1.609;
        System.out.println(num1 + " millas son " + num2 + " kilometros");
    }
}
