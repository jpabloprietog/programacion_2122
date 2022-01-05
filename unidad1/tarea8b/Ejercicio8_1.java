//Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
//El programa nos pedirá la combinación para abrirla.
//Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
//Tendremos cuatro oportunidades para abrir la caja fuerte.

package unidad1.tarea8b;

import java.util.Scanner;

public class Ejercicio8_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int combinacionAbrir = 2022;
        int combinacionIntroducida = 0;
        boolean combinacionCorrecta = false;

        for (int i = 0; i < 4; i++) {

            System.out.println("Introduce la combinación para abrir la caja fuerte");
            combinacionIntroducida = scanner.nextInt();
            if (combinacionAbrir == combinacionIntroducida) {
                combinacionCorrecta = true;
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación correcta");
            }
        }
        if (combinacionCorrecta) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        } else System.out.println("Has agotado todas las oportunidades");
    }
}
