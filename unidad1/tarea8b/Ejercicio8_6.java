//Lo mismo que el 5 pero la pirámide hueca.

package unidad1.tarea8b;

import java.util.Scanner;

public class Ejercicio8_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int altura;
        char caracter;

        System.out.println("Introduce la altura de la piramide");
        altura = scanner.nextInt();

        System.out.println("Introduce un caracter para pintar la piramide");
        caracter = scanner.next().charAt(0);

        //El valor de i es: {0,1,2} para altura = 4.
        for (int i = 0; i < altura - 1; i++) {

            //El valor de j es: {0,1,2,3,4,5,6}
            for (int j = 0; j < (altura * 2) - 1; j++) {

                if (j == ((altura - 1) - i) || j == ((altura - 1) + i)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < (altura * 2) - 1; i++) {
            System.out.print(caracter);
        }
    }
}