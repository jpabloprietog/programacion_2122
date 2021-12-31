//Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,etc.
//El programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_14 {

    public static void main(String[] args) {

        String a;
        int opcion;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un carácter de relleno");
        a = scanner.next();

        System.out.println("Elige el vertice de la piramida");
        System.out.println("1. Vertice hacia arriba");
        System.out.println("2. Vertice hacia abajo");
        System.out.println("3. Vertice hacia la derecha");
        System.out.println("4. Vertice hacia la izquierda");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(" " + " " + a);
                System.out.println(" " + a + a + a);
                System.out.println(a + a + a + a + a);
                break;
            case 2:
                System.out.println(a + a + a + a + a);
                System.out.println(" " + a + a + a);
                System.out.println(" " + " " + a);
                break;
            case 3:
                System.out.println(a);
                System.out.println(a + " " + a);
                System.out.println(a + " " + a + " " + a);
                System.out.println(a + " " + a);
                System.out.println(a);
                break;
            case 4:
                System.out.println(a);
                System.out.println(a + " " + a);
                System.out.println(a + " " + a + " " + a);
                System.out.println(a + " " + a);
                System.out.println(a);
                break;
            default:
        }
    }
}
