//Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto.
//Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1.
//Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca las alturas de los arboles en cm, para terminar introduzca -1");

        int alturaArbol;
        int idArbol = 0;
        int alturaArbolMax = 1;
        int idArbolAlturaMax = 0;

        do {

            alturaArbol = scanner.nextInt();
            //REPASAR
            if (alturaArbol > alturaArbolMax) {
                alturaArbolMax = alturaArbol;
                idArbolAlturaMax = idArbol;
            }
            idArbol++;
        } while (alturaArbol != -1);
        System.out.println("El arbol más alto es el ID " + idArbolAlturaMax);
        System.out.println(idArbolAlturaMax + " mide " + alturaArbolMax + " cm");
    }
}
