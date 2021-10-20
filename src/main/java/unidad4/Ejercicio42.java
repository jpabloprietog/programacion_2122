package unidad4;

import java.util.Scanner;

public class Ejercicio42 {

    public static void main(String[] args) {

        int numero = 12;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número 12");
        numero = scanner.nextInt();

        if (numero == 12){
            System.out.println("Es correcto");
        } else {
            System.out.println("No es correcto");
        }
    }
}
