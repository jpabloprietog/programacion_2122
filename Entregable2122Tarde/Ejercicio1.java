//Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas
//(la cadena a adivinar y el resultado parcial) y un carácter a buscar en la cadena a adivinar.
//Debe devolver el resultado de encontrar ese character en la cadena a adivinar.
//
//La función tendrá el siguiente prototipo:
//
//public static String palabraAhorcado(String a, String b, char c)
//
//En el programa principal, se debe pedir al usuario que introduzca una palabra a adivinar
//y un carácter a buscar en la cadena. Se pedirá caracteres hasta que se consiga adivinar la palabra completa.
//
//NOTA: La palabra a adivinar no contendrá tildes ni caracteres extraños,
//además será en minúsculas para simplificar el ejercicio.

package Entregable2122Tarde;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cadenaAdivinar = "Programacion";
        String cadena2Resultado = "";
        char letra;

        for (int i = 0; i < cadenaAdivinar.length(); i++) {
            cadena2Resultado += "-";

        }

        do {
            System.out.println(cadenaAdivinar);
            System.out.println("Introduzca una letra");
            letra = scanner.nextLine().charAt(0);

        } while (!cadenaAdivinar.equalsIgnoreCase(cadena2Resultado));
    }

    public static String palabraAhorcado(String cadenaAdivinar, String cadena2Resultado, char letra) {
        cadena2Resultado = "";

        for (int i = 0; i < cadenaAdivinar.length(); i++) {
            if (cadenaAdivinar.charAt(i) == letra) {
                return cadena2Resultado += letra;

            } else cadena2Resultado += "-";
        }
        return cadena2Resultado;
    }
}




