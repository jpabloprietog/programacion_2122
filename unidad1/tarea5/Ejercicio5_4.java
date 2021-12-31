//Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.

package unidad1.tarea5;

import java.util.Scanner;

public class Ejercicio5_4 {

    public static void main(String[] args) {

        int numero1, numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero entero");
        numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo numero entero");
        numero2 = scanner.nextInt();


        if (numero1 % 2 == 0) {
            System.out.println(numero1 + " es número par");
        } else {
            System.out.println(numero1 + " no es número par");
        }
        if (numero2 % 2 == 0) {
            System.out.println(numero2 + " es número par");
        } else {
            System.out.println(numero2 + " no es número par");
        }
    }
}

