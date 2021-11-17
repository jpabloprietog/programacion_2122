//Crea un programa que pida al usuario que introduzca el número 12.
//Después debe decirle si lo ha hecho correctamente o no.
package unidad1.comprobacion_condiciones;

import java.util.Scanner;

public class Ejercicio5_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número 12");
        int numero = scanner.nextInt();

        if (numero == 12){
            System.out.println("Es correcto");
        } else {
            System.out.println("No es correcto");
        }
    }
}