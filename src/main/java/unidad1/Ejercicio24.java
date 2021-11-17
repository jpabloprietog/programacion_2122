package unidad1;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        int millas = 1;
        int metros = 1609;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame una longitud en millas");
        millas = scanner.nextInt();

        System.out.println(millas*metros);
        System.out.println("El resultado es:"+ millas*metros);

    }
}
