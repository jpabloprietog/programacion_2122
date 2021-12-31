//Crea un programa que diga si el número introducido por el usuario es impar o no lo es.

package unidad1.tarea5;

import java.util.Scanner;

public class Ejercicio5_3 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        numero = scanner.nextInt();

        if (numero % 2 != 0) {
            System.out.println("Es impar");
        } else {
            System.out.println("No es impar");
        }
    }
}
