//Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
//números enteros a partir de uno que se introduce por teclado.

package unidad1.tarea8b;

import java.util.Scanner;

public class Ejercicio8_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número");
        numero = scanner.nextInt();

        // i = numero. Se añaden 5 números más a partir del que hemos introducido.
        for (int i = numero; i < (numero + 5); i++) {

            System.out.println(i + " " + i * i + " " + i * i * i);

        }
    }
}
