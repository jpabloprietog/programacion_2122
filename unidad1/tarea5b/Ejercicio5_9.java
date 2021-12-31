//Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_9 {

    public static void main(String[] args) {

        int mes, dia;
        String horoscopo = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el día de su nacimiento");
        dia = scanner.nextInt();

        System.out.println("Introduce el més de su nacimiento");
        mes = scanner.nextInt();

        switch (mes) {
            case 1:
                if (dia < 21) {
                    horoscopo = "Capricornio";
                } else {
                    horoscopo = "Acuario";
                }
                break;
            case 2:
                if (dia < 20) {
                    horoscopo = "Acuario";
                } else {
                    horoscopo = "Piscis";
                }
                break;
            case 3:
                if (dia < 21) {
                    horoscopo = "Piscis";
                } else {
                    horoscopo = "Aries";
                }
                break;
            case 4:
                if (dia < 21) {
                    horoscopo = "Aries";
                } else {
                    horoscopo = "Tauro";
                }
                break;
            case 5:
                if (dia < 20) {
                    horoscopo = "Tauro";
                } else {
                    horoscopo = "Geminis";
                }
                break;
            case 6:
                if (dia < 22) {
                    horoscopo = "Geminis";
                } else {
                    horoscopo = "Cancer";
                }
                break;
            case 7:
                if (dia < 22) {
                    horoscopo = "Cancer";
                } else {
                    horoscopo = "Leo";
                }
                break;
            case 8:
                if (dia < 23) {
                    horoscopo = "Leo";
                } else {
                    horoscopo = "Virgo";
                }
                break;
            case 9:
                if (dia < 23) {
                    horoscopo = "Virgo";
                } else {
                    horoscopo = "Libra";
                }
                break;
            case 10:
                if (dia < 23) {
                    horoscopo = "Libra";
                } else {
                    horoscopo = "Escorpio";
                }
                break;
            case 11:
                if (dia < 23) {
                    horoscopo = "Escorpio";
                } else {
                    horoscopo = "Sagitario";
                }
                break;
            case 12:
                if (dia < 21) {
                    horoscopo = "Sagitario";
                } else {
                    horoscopo = "Capricornio";
                }
                break;
            default:
        }
        System.out.println("Tu horoscopo es " + horoscopo);
    }
}

