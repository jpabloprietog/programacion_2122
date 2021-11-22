//Implementar la función divisoresPrimos()
//que muestra, por consola, todos los divisores primos del número que se le pasa como parámetro

package Ejercicios.unidad3;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número");
        num = scanner.nextInt();

        fDivisoresPrimos(num);
    }

    public static void fDivisoresPrimos(int num) {
        System.out.println("Son divisores primos de " + num + " : ");

        for (int i = 1; i < num; i++) {

            if (num % i == 0 && fEsPrimo(i)) {
                System.out.println(i + " ");
            }

        }
    }

    public static boolean fEsPrimo(int num) {

        boolean EsPrimo = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                EsPrimo = false;
                break;
            }
        }
        return EsPrimo;
    }
}
