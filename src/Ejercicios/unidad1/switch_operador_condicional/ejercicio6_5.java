// Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia,
//y a continuación muestre un pequeño menú con 3 opciones:
//
//1.Calcular diámetro
//
//2.Calcular perímetro
//
//3.Calcular área
//
//Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
//(diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)
package Ejercicios.unidad1.switch_operador_condicional;

import java.util.Scanner;

public class ejercicio6_5 {

    public static void main(String[] args) {

        int radio, diametro, perimetro, area, menu;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el valor del radio");
        radio = scanner.nextInt();

        System.out.println("1º Calcular diámetro");
        System.out.println("2º Calcular perímetro");
        System.out.println("3º Calcular área");
        menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("El diámetro de la circunferencia es " + (2 * radio));
                break;
            case 2:
                System.out.println("El perímetro de la circunferencia es " + (2 * Math.PI * radio));
                break;
            case 3:
                System.out.println("El área de la circunferencia es " + (Math.PI * radio * radio));
                break;
            default:
                System.out.println("No ha introducido 1, 2 o 3.");
                break;

        }


    }
}
