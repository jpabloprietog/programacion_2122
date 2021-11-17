package unidad4;

import java.util.Scanner;

public class Ejercicio45 {

    public static void main(String[] args) {

        long numero1, numero2, numero3;
        long mayor;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        numero1 = scanner.nextLong();
        System.out.println("Introduce el segundo numero");
        numero2 = scanner.nextLong();
        System.out.println("Introduce el tercer numero");
        numero3 = scanner.nextLong();

        if (numero1 > numero2) {
            mayor = numero1;

        } else {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            System.out.println("El numero mayor es: " + numero3);
        } else {
            System.out.println("El numero mayor es: " + mayor);

        }
    }
}