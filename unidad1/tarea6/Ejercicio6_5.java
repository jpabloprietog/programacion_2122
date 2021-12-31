//Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia,
//y a continuación muestre un pequeño menú con 3 opciones:
//(diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)

package unidad1.tarea6;

import java.util.Scanner;

public class Ejercicio6_5 {

    public static void main(String[] args) {

        int radio, diametro, perimetro, area, menu;

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduzca el valor del radio");
        radio = scanner.nextInt();

        System.out.println("1ºdiametro= 2 x radio");
        System.out.println("2ºperimetro= 2 x pi x radio");
        System.out.println("3ºarea = pi x radio x radio");
        menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("El perimetro es " + (2 * radio));
                break;
            case 2:
                System.out.println("El diametro es " + (2 * (Math.PI) * radio));
                break;
            case 3:
                System.out.println("El area es " + (Math.PI) * (Math.pow(radio, 2)));
                break;

            default:
                System.out.println("No ha introducido los valores 1, 2 o 3.");
                break;
        }
    }
}
