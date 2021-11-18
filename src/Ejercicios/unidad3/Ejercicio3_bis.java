//Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
//Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen).
// Además, hemos de pasarle a la función el radio de la base y la altura.
//
//Área total:
//
//
//
//volumen:
package Ejercicios.unidad3;

import java.util.Scanner;

public class Ejercicio3_bis {

    public static void main(String[] args) {

        int baseRadio, altura, areaVolumen;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el radio de la base");
        baseRadio = scanner.nextInt();

        System.out.println("Introduce la altura");
        altura = scanner.nextInt();

        System.out.println("Introduzca 1: calcular area");
        System.out.println("Introduzca 2: calcular volumen");
        areaVolumen = scanner.nextInt();

        fAreaVolumen(areaVolumen, baseRadio, altura);
    }

    static void fAreaVolumen(int areaVolumen, int baseRadio, int altura) {
        if (areaVolumen == 1) {
            System.out.println(2 * Math.PI * baseRadio * (altura + baseRadio));
        } else if (areaVolumen == 2) {
            System.out.println(Math.PI * baseRadio * baseRadio * altura);
        } else {
            System.out.println("Error, no ha introducido un valor valido");
        }

    }

}
