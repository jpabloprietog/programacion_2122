//Bucles indeterminados: While(mientras)
//
//while(condicion = true){
//Linea1
//linea2
//...
//}
//contraseña y aleatorios.

package Recuperacion;

import java.util.Scanner;

public class bucle_while {

    public static void main(String[] args) {

       /* String clave = "Juanpablo";
        String contraseña = "";

        Scanner scanner = new Scanner(System.in);

        while (clave.equals(contraseña) == false) {

            System.out.println("Introduce la contraseña:");
            contraseña = scanner.next();

            if (clave.equals(contraseña) == false) {

                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta. Acceso Permitido");
    }
}
*/
//---------------------------------------------------------------------------------
        //Numeros aleatorios entre 0 y 100. Clase (math.random())

        int aleatorio=(int)(Math.random()*100);

        Scanner scanner = new Scanner(System.in);

        int numero=0;
        int intentos=0;

        while (numero!=aleatorio){
            intentos++;

            System.out.println("Introduce un número, por favor");
            numero=scanner.nextInt();

            if (aleatorio<numero){
                System.out.println("Más bajo");
            }
            else if (aleatorio>numero){
                System.out.println("Más alto");
            }
        }
        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos.");
    }
}