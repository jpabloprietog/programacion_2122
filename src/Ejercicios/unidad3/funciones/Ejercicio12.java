//Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.

package Ejercicios.unidad3.funciones;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        num = scanner.nextInt();

        System.out.println(fFactorial(num));
    }
    static int fFactorial(int n){
        if(n == 0)
            return 1;
        if (n == 1)
            return 1;
        return fFactorial(n - 1) * n;
    }
}
