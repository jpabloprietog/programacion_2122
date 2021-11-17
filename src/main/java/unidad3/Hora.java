package unidad3;

import java.util.Calendar;

public class Hora {
    public static void main(String[] args) {

        int hora, minutos, segundos;

        Calendar calendario = Calendar.getInstance();

        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);

        System.out.println(hora + ":" + minutos + ":" + segundos);

        }


    }
