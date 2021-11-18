//Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números. Piensa un poco,
//no hagas el algoritmo de comparación de los 3 números desde cero.

package Ejercicios.unidad3;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número");
       int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número");
       int num2 = scanner.nextInt();

        System.out.println("Introduce el tercer número");
        int num3 = scanner.nextInt();

        System.out.println("El mayor es " + fMayor(fMayor(num1, num2), num3));
    }

    static int fMayor(int num1, int num2) {
        return num1 > num2 ? num1 : num2;

    }
}
