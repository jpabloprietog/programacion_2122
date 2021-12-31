//Condicional (SWITCH)
//Ejemplos: Area cuadrado (lado), rectangulo (base y altura), triangulo (base y altura), circulo (PI * radio^2).
package Recuperacion;

import java.util.Scanner;

public class condicional2 {

    public static void main(String[] args) {

        int entrada;

        Scanner scanner = new Scanner(System.in);

        // \n -> salto de linea
        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

        int figura = scanner.nextInt();

        switch (figura) {

            case 1:

                System.out.println("Introduce el area del cuadrado");
                int lado = scanner.nextInt();
                System.out.println("El area del cuadrado es " + Math.pow(lado, 2));

                break;

            case 2:

                System.out.println("Introduce la base del rectangulo");
                int base = scanner.nextInt();

                System.out.println("Introduce la altura del rectangulo");
                int altura = scanner.nextInt();

                System.out.println("El area del rectangulo es " + base * altura);

                break;

            case 3:

                System.out.println("Introduce la base del triangulo");
                base = scanner.nextInt();

                System.out.println("Introduce la altura del triangulo");
                altura = scanner.nextInt();

                System.out.println("El area del triangulo es " + (base * altura) / 2);

                break;

            case 4:

                System.out.println("El area del circulo es ");
                int radio = scanner.nextInt();

                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));

                break;

            default:
                System.out.println("La opcion no es correcta");
        }
    }
}
