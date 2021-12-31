// Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
// Realizar la media de los números positivos, la media de los negativos, y contar el número de
// ceros introducidos.

package unidad3.tarea3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantos números desea introducir?");
        int longitud = scanner.nextInt();
        int[] ar = new int[longitud];

        for (int i = 0; i < ar.length; i++) {
            System.out.println("Introduzca número:");
            ar[i] = scanner.nextInt();
        }
        double sumaPositivos = 0;
        int contPositivos = 0;
        double sumaNegativos = 0;
        int contNegativos = 0;
        int cont0 = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0) {
                sumaNegativos = sumaNegativos + ar[i];
                contNegativos++;
            } else if (ar[i] > 0) {
                sumaPositivos = sumaPositivos + ar[i];
                contPositivos++;
            } else {
                cont0++;
            }
        }
        System.out.println("Media positivos: " + sumaPositivos / contPositivos);
        System.out.println("Media Negativos: " + sumaNegativos / contNegativos);
        System.out.println("Número de 0: " + cont0);
    }
}
