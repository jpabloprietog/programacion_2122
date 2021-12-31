//Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes.
//Por ejemplo, si el usuario introduce 9, deberá escribir "septiembre".

package unidad1.tarea6;

import java.util.Scanner;

public class Ejercicio6_1 {

    public static void main(String[] args) {

        int mes;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de un mes");
        mes = scanner.nextInt();

        String nombre;

        switch (mes) {
            case 1:
                nombre = "enero";
                break;
            case 2:
                nombre = "febrero";
                break;
            case 3:
                nombre = "marzo";
                break;
            case 4:
                nombre = "abril";
                break;
            case 5:
                nombre = "mayo";
                break;
            case 6:
                nombre = "junio";
                break;
            case 7:
                nombre = "julio";
                break;
            case 8:
                nombre = "agosto";
                break;
            case 9:
                nombre = "septiembre";
                break;
            case 10:
                nombre = "octubre";
                break;
            case 11:
                nombre = "noviembre";
                break;
            case 12:
                nombre = "diciembre";
                break;

            default:
                nombre = "No existe ese mes";
        }
        System.out.println("Mes " + mes + ": " + nombre);
    }
}
