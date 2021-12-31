//Clases Predefinidas (String, Math, Array, Thread).
//Refundición

package Recuperacion;

public class claseMath {

    public static void main(String[] args) {

        //Math.sqrt(double a) -> raiz cuadrada de un número.
        //Math.pow(double a, double b) -> potencia de un número. Base y exponente son doubles.
        //Math.sin(angulo). Math.cos(angulo). Math.tan(angulo). Math.atan(angulo).
        //Math.round(double a) -> redondeo de un número.
        //Math.PI -> constante de clase con el número PI.

        //double raiz=Math.sqrt(9);
        //System.out.println(raiz);

        //float num1=5.85F;
        //int resultado=Math.round(num1);
        //System.out.println(resultado);

        //int raiz=(int)Math.round(num1);

        double base=5;
        double exponente=3;

        int resultado=(int)Math.pow(base, exponente);
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
    }
}
