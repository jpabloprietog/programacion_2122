//Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Introduce un numero");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
