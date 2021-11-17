package unidad4;

import java.util.Scanner;

public class Ejercicio44 {

    public static void main(String[] args) {

        int numero1, numero2;
        int contador = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        numero1 = scanner.nextInt();
        System.out.println("Introduce otro número");
        numero2 = scanner.nextInt();

        if (numero1 % 2 == 0) {
            contador = contador + 1;
        }
        if (numero2 % 2 == 0) {
            contador = contador + 1;
        }
        System.out.println("Hay " + contador + " numeros pares");
    }
}