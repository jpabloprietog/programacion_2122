package Ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el dividendo");

        int dividendo = scanner.nextInt();
        System.out.println("Introduzca el divisor");

        int divisor = scanner.nextInt();
        System.out.println("El resultado final es: ");
        System.out.println(dividendo/divisor);

        scanner.close();
    }
}
