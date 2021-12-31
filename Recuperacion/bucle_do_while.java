//Do-While (Hacer, y a continuacion evalua la condicion)
//
//Do{
//Linea1
//Linea2
//...
//}while(condicion);

package Recuperacion;

import java.util.Scanner;

public class bucle_do_while {

    public static void main(String[] args) {

      /*  int numero = 0;
        int intentos = 0;

        int aleatorio = (int) (Math.random() * 100);

        Scanner scanner = new Scanner(System.in);

        do {
            intentos++;
            System.out.println("Introduce un número, por favor");

            numero = scanner.nextInt();

            if (aleatorio < numero) {
                System.out.println("Más Bajo");
            } else if (aleatorio > numero) {
                System.out.println("Más alto");
            }
        } while (numero != aleatorio);
        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");*/

        //-----------------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        String genero="";

        do {
            System.out.println("Introduce tu genero (H/M)");
            genero=scanner.next();

        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        System.out.println("introduce altura en cm");
        int altura = scanner.nextInt();

        int pesoideal=0;

        if(genero.equalsIgnoreCase("H")){
            pesoideal=altura-110;
        }
        else if (genero.equalsIgnoreCase("M")){
            pesoideal=altura-120;
        }
        System.out.println("Tu peso ideal es " + pesoideal + " kg");
    }
}

