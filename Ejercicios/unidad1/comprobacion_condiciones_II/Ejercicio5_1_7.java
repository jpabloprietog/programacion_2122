//Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).

package Ejercicios.unidad1.comprobacion_condiciones_II;

import java.util.Scanner;

public class Ejercicio5_1_7 {

    public static void main(String[] args) {

        double nota1, nota2, nota3, media;
        String boletin;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        nota1 = scanner.nextDouble();
        System.out.println("Introduce la segunda nota");
        nota2 = scanner.nextDouble();
        System.out.println("Introduce la tercera nota");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media < 5) {
            boletin = " Insuficiente";
        } else if
        (media >= 5 && media < 6) {
            boletin = " Suficiente";
        } else if (media >= 6 && media < 7) {
            boletin = " Bien";
        } else if (media >= 7 && media < 9) {
            boletin = " Notable";
        } else {
            boletin = " Sobresaliente";
        }
        System.out.println("La nota media es " + media + boletin);
    }
}
