package unidad4;

import java.util.Scanner;

public class Ejercicio41 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es Negativo");
        }
    }
}
