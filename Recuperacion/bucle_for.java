//Bucles determinados. For y For each.
//
//for(inicio bucle, condicion, contador bucle){
//linea1
//linea2
//...
//}
//
//Cadenas de caracteres, Recorrer Arrays.

package Recuperacion;

import java.util.Scanner;

public class bucle_for {

    public static void main(String[] args) {

        /*for (int i=0; i<10; i++) {

            System.out.println("Juan Pablo");
        }*/

        /*for (int i=10; i>0; i--) {

            System.out.println("Juan Pablo");

        }*/

        /*for (int i=0; i<20; i+=2) {

            System.out.println("Juan Pablo");
        }*/

        //-------------------------------------------------------//

        Scanner scanner = new Scanner(System.in);

        boolean arroba=false;

        String mail;

        System.out.println("Introduce un email");
        mail=scanner.next();

        for (int i=0; i<mail.length(); i++) {

            if (mail.charAt(i)=='@'){
                arroba=true;
            }
        }
        if (arroba==true){
            System.out.println("El email es correcto");
        }
        else{
            System.out.println("El email no es correcto");
        }
    }
}
