//Crea un programa que calcule y muestre
//la división de dos números reales de doble precisión introducidos por el usuario.
package Ejercicios.unidad1.operaciones_basicas_tipo_datos;

import java.util.Scanner;

public class Ejercicio3_3 {

    public static void main(String[] args) {

        double num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        num1 = scanner.nextDouble();

        System.out.println("Introduce otro número");
        num2 = scanner.nextDouble();

        System.out.println("La division es: " + ((double) num1 / (double) num2));

    }
}
