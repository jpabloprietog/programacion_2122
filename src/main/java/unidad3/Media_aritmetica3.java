package unidad3;

import java.util.Scanner;

public class Media_aritmetica3 {

    public static void main(String[] args) {

        double nota1, nota2, nota3, total;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la primera nota: ");

        nota1 = scanner.nextDouble();
        System.out.println("Introduce la segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.println("Introduce la tercera nota: ");
        nota3 = scanner.nextDouble();

        total = (nota1 + nota2 + nota3);
        System.out.println(("La media aritmetica de las tres notas es: " + ((int) total) / 3));
    }
}
