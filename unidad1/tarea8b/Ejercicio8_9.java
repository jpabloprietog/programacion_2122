//Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
//El programa pedirá la altura.
//El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.

package unidad1.tarea8b;

import java.util.Scanner;

public class Ejercicio8_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int altura;

        System.out.println("Introduce la altura");
        altura = scanner.nextInt();

        for (int i = 0; i < altura - 1; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < ((altura / 2) + 1); i++) {
            System.out.print("*");
        }
    }
}
