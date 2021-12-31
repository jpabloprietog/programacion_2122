//Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero)
//o si, por el contrario, no lo es (usando "else").
package unidad1.tarea5;

import java.util.Scanner;

public class Ejercicio5_1 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println(numero + " es positivo");
        } else {
            System.out.println(numero + " no es positivo");
        }
    }
}