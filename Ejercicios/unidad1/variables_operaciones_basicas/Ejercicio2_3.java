//Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.
package Ejercicios.unidad1.variables_operaciones_basicas;

import java.util.Scanner;

public class Ejercicio2_3 {

    public static void main(String[] args) {

        int num1, num2;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        num1 = scanner.nextInt();

        System.out.println("Introduce otro numero");
        num2 = scanner.nextInt();


        System.out.println("La división es: " + (num1 / num2));

    }
}
