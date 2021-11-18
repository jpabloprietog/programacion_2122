package Ejercicios.unidad3;

public class Capicua {

    public static void main(String[] args) {

        long num = 74547;
        long cociente = num;
        long resto = 0;
        long rev = 0;

        while (cociente > 0) {
            resto = cociente % 10;
            cociente = cociente / 10;
            System.out.println("cociente: " + cociente + " resto: " + "rev: " + rev);
        }
        rev = rev / 10;
        System.out.println("cociente: " + cociente + " resto: " + "rev: " + rev);

        if (num == rev) {
            System.out.println("El numero es capicúo");
        } else {
            System.out.println("El numero NO es capicuo");
        }
    }
}
