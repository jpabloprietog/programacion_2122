//Escribe un programa que muestre la hora actual.
package unidad1.tipo_datos_conversion_tipo;

import java.util.Calendar;

public class Ejercicio4_5 {

    public static void main(String[] args) {

        int hora, minutos, segundos;

        Calendar calendario = Calendar.getInstance();

        hora = calendario.get(calendario.HOUR_OF_DAY);
        minutos = calendario.get(calendario.MINUTE);
        segundos = calendario.get(calendario.SECOND);

        System.out.println("La hora actual es " + hora + ":" + minutos + ":" + segundos);

    }
}
