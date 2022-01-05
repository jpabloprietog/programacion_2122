//Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado,
//utilizando para ello asteriscos (*). Por ejemplo, para n=4:

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lado;

        System.out.println("Introduce el número del lado del triangulo");
        lado = scanner.nextInt();

        for (int i = lado; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
