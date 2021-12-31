//Bucles determinados. For
//Ejemplo bucle for y factorial de un numero. (numero!)

package Recuperacion;

import java.util.Scanner;

public class bucle_for2 {

    public static void main(String[] args) {

        /*int arroba = 0;
        boolean punto = false;
        String mail;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce email");
        mail = scanner.next();

        for (int i = 0; i < mail.length(); i++) {

            if (mail.charAt(i) == '@') {
                arroba++;
            }

            if (mail.charAt(i) == '.') {
                punto = true;
            }
        }
        if (arroba == 1 && punto == true) {
            System.out.println("Es correcto");
        } else {
            System.out.println("No es correcto");
        }*/

        //-------------------------------------------------------------------//

        long resultado = 1L;
        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        numero = scanner.nextInt();

        //numero=4, i=4, i--(resta 1)
        for (int i = numero; i > 0; i--) {

            //resultado=4
            resultado = resultado * i;

        }
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}