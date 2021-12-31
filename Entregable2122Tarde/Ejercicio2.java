//Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:
//
//public static int[] insertarEnVector(int[] v1, int [] v2, int pos)
//
//Recibirá como parámetros dos vectores de enteros y una posición.
//Devolverá un vector de enteros que contenga el primer array con el segundo array insertado de manera completa a partir de la posición dada. Si la posición es menor que 0, el vector devuelto deberá contener el primer array.
//Si la posición es mayor que la longitud del primer array, el vector devuelto deberá contener el segundo array. Si la posición es igual a la longitud del primer array, el vector devuelto deberá contener el primer array con el segundo array insertado al final. Probar dicha función en el método Main.

package Entregable2122Tarde;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {

        int[] v1 = {1,2,3,4,5,6};
        int[] v2 = {4,9,12,5,7};
        int pos = 2;

        System.out.println("v2" + Arrays.toString(v1));
        System.out.println("v2" + Arrays.toString(v2));
        System.out.println("pos" + pos);


        System.out.println(Arrays.toString(insertarEnVector(v1, v2, pos)));

        int[] v3 = {6,12,8,9,3,13};
        int[] v4 = {13,11,4,8,6,1};
        pos = -1;

        System.out.println(Arrays.toString(insertarEnVector(v3, v4, pos)));

    }

    public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
        int[] vr = new int[v1.length + v2.length];

        if (pos == 0){
            return v1;
        } else if (pos > v1.length)
        if (pos > v1.length) return v2;

        int idv1 = 0;
        int idv2 = 0;

        for (int i = 0; i < pos; i++) {
            vr[i] = v1[idv1];
            idv1++;
        }

        for (int i = pos; i < v2.length+pos; i++) {
            vr[i] = v2[idv2];
            idv2++;

        }

        for (int i = pos+v2.length; i < vr.length+pos; i++) {
            vr[i] = v1[idv1];
            idv1++;
        }

        return vr;}
    }

