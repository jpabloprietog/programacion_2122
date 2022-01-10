//Realiza un programa que pinte una X hecha de asteriscos.
//El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3,
//en caso contrario se debe mostrar un mensaje de error.

package unidad1.tarea8b;

import java.util.Scanner;

public class Ejercicio8_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int altura;

        do {
            System.out.println("Introduce la altura");
            altura = scanner.nextInt();
        } while ((altura < 3) || altura % 2 == 0);

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < altura; j++) {
                if (j == i || j + i == (altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
