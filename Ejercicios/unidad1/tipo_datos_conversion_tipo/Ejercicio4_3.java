//Modificar el ejercicio anterior para que muestre la parte entera de la media de tres notas decimales.
package Ejercicios.unidad1.tipo_datos_conversion_tipo;

import java.util.Scanner;

public class Ejercicio4_3 {

    public static void main(String[] args) {

        float nota1, nota2, nota3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        nota1=scanner.nextFloat();
        System.out.println("Introduce la segunda nota");
        nota2=scanner.nextFloat();
        System.out.println("Introduce la tercera nota");
        nota3=scanner.nextFloat();

        float media = ((nota1 + nota2 + nota3)/3);
        System.out.println("La media aritmetica de las tres notas es: " + media);
        System.out.println("La parte entera de la media aritmetica de las tres notas es " + (int) media);


    }
}
