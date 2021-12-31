//Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras.
//Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias
//(40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
//
//Ejemplo 1:
//Por favor, introduzca el número de horas trabajadas durante la semana: 36
//El sueldo semanal que le corresponde es de 432 euros
//Ejemplo 2:
//Por favor, introduzca el número de horas trabajadas durante la semana: 40
//El sueldo semanal que le corresponde es de 480 euros
//Ejemplo 3:
//Por favor, introduzca el número de horas trabajadas durante la semana: 55
//El sueldo semanal que le corresponde es de 720 euros

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_4 {

    public static void main(String[] args) {

        int horas;
        int hora_ordinaria = 12;
        int hora_extra = 16;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce las horas trabajadas durante la semana");
        horas = scanner.nextInt();

        if (horas <= 40) {
            System.out.println("El sueldo semanal que le corresponde es de: " + horas * hora_ordinaria + " €");
        } else {
            System.out.println("El sueldo semanal que le corresponde es de: " + (((horas - 40) * hora_extra) + 480 + " €"));
        }
    }
}
