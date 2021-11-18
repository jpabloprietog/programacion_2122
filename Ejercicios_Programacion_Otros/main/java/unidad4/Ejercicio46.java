package unidad4;

import java.util.Scanner;

public class Ejercicio46 {

    public static void main(String[] args) {

        float gravedad = 9.8f;
        double tiempo;
        double velocidad;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor de tiempo");
        tiempo = scanner.nextDouble();

        if (tiempo <= 0) {
            System.out.println("El tiempo es incorrecto");
        } else {
            velocidad = gravedad * tiempo;
            System.out.println("La velocidad es = " + velocidad);
        }
    }
}