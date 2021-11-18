package unidad2;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
        byte primernumero, segundonumero;
       Scanner scanner = new Scanner (System.in);
       System.out.println("Introduce un número de dos cifras");
       primernumero = scanner.nextByte();
       System.out.println("Introduce otro número de dos cifras");
       segundonumero = scanner.nextByte();
       System.out.println(primernumero + segundonumero);
       System.out.println("la suma de los dos numeros es:" + (primernumero+segundonumero));

    }
}
