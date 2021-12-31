// Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se
// especifique. Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para
// volumen). Además, hemos de pasarle a la función el radio de la base y la altura.

package unidad3.tarea1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el radio de la base");
        int radioBase = scanner.nextInt();

        System.out.println("Introduzca la altura");
        int altura = scanner.nextInt();

        System.out.println("Introduzca 1: calcular area");
        System.out.println("Introduzca 2: calcular volumen");
        int areaVolumen = scanner.nextInt();

        fAreaVolumen(areaVolumen, radioBase, altura);
    }

    static void fAreaVolumen(int areaVolumen, int radioBase, int altura) {
        if (areaVolumen == 1) {
            System.out.println(2 * Math.PI * radioBase * (altura + radioBase));
        } else if (areaVolumen == 2) {
            System.out.println(Math.PI * radioBase * radioBase * altura);
        } else {
            System.out.println("Error, no ha introducido un valor valido.");
        }
    }
}
