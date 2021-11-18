//Crea un programa que calcule
//y muestre la suma de dos números de dos cifras (de tipo byte) que introduzca el usuario.
package Ejercicios.unidad1.operaciones_basicas_tipo_datos;

import java.util.Scanner;

public class Ejercicio3_1 {

    public static void main(String[] args) {

        byte num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        num1 = scanner.nextByte();

        System.out.println("Introduzca otro numero");
        num2 = scanner.nextByte();

        System.out.println("La suma es: " + (num1 + num2));
    }
}
