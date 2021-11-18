package unidad4;

import java.util.Scanner;

public class Ejercicio43 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
    }
}
