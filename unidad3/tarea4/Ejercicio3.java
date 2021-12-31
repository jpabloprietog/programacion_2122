/*
     Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En
     una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales(mesa llena).
     Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado
     para colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo
     de 6, el programa dará el mensaje“Lo siento, no admitimos grupos de 6, haga grupos de 4
     personas como máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la primera
     mesa libre (con 0 personas).
     Si no quedan mesas libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
     grupo es de dos personas, se podrá colocar donde haya una o dos personas. Inicialmente, las
     mesas se cargan con valores aleatorios entre 0 y 4.
    */

package unidad3.tarea4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] mesaOcupacion = new int[2][10];

        for (int i = 0; i < mesaOcupacion[0].length; i++) {
            mesaOcupacion[0][i] = i + 1;
        }
        for (int i = 0; i < mesaOcupacion[1].length; i++) {
            mesaOcupacion[1][i] = (int) (Math.random() * 5);
        }

        for (int[] fila : mesaOcupacion) {
            System.out.println(Arrays.toString(fila));
        }

        int numComensales;
        boolean yaSentados = false;

        do {
            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa):");
            numComensales = scanner.nextInt();

            while (numComensales > 4) {
                System.out.println(
                        "Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
                numComensales = scanner.nextInt();
            }
            if (numComensales == -1) break;
            for (int i = 0; i < mesaOcupacion[1].length; i++) {
                yaSentados = false;
                if (mesaOcupacion[1][i] == 0) {
                    mesaOcupacion[1][i] = numComensales;
                    System.out.println("Por favor, siéntese en la mesa número " + mesaOcupacion[0][i] + ".");
                    yaSentados = true;
                    break;
                }
            }
            if (!yaSentados) {
                for (int i = 0; i < mesaOcupacion[1].length; i++) {
                    if (mesaOcupacion[1][i] + numComensales <= 4) {
                        mesaOcupacion[1][i] = mesaOcupacion[1][i] + numComensales;
                        System.out.println(
                                "Tendrá que compartir mesa. Por favor, siéntese en la mesa número "
                                        + mesaOcupacion[0][i]
                                        + ".");
                        yaSentados = true;
                        break;
                    }
                }
            }
            if (!yaSentados) System.out.println("Lo siento, en estos momentos no queda sitio");

            for (int[] fila : mesaOcupacion) {
                System.out.println(Arrays.toString(fila));
            }

        } while (true);

        System.out.println("Gracias, Hasta pronto.");
    }
}
