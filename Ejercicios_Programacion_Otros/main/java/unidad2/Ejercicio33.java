package Ejercicios.unidad2;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {

        double numero1, numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero1 = scanner.nextDouble();

        System.out.println("Introduce otro numero");
        numero2 = scanner.nextDouble();

        System.out.println(numero1/numero2);
        System.out.println("El resultado es:" + (numero1/numero2));

        scanner.close();
    }
}
