//Crea un programa que pida al usuario una temperatura en grados centígrados
//y calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).
package unidad1.variables_operaciones_basicas;

import java.util.Scanner;

public class Ejercicio2_5 {

    public static void main(String[] args) {

        int temperatura;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la temperatura el grados");
        temperatura = scanner.nextInt();

        System.out.println("La temperatura en grados Fahrenheit es: " + (9 * (temperatura /5) + 32));


    }
}
