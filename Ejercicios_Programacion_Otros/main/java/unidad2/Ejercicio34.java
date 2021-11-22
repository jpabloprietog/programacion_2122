package Ejercicios.unidad2;

import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {

        float milla;
        float kilometro = 1609;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de millas");
        milla = scanner.nextFloat();
        System.out.println(milla*kilometro);
        System.out.println("la longitud es: " + (milla*kilometro) + " kilometros");

        scanner.close();
    }
}
