//Escribe un programa que muestre la hora actual.

package unidad1.tarea4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ejercicio4_5 {

    public static void main(String[] args) {

        LocalDateTime localDate = LocalDateTime.now();

        int hours = localDate.getHour();
        int minutes = localDate.getMinute();
        int seconds = localDate.getSecond();

        System.out.println("La hora actual es " + hours + ":" + minutes + ":" + seconds);

    }
}
