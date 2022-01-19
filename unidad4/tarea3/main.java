package unidad4.tarea3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Creamos la cuenta corriente
        System.out.println("Introduzca el nombre completo");
        String nombreCLiente = scanner.nextLine();

        System.out.println("Introduzca el DNI");
        String DNI = scanner.next();

        cuentaCorriente c1 = new cuentaCorriente(nombreCLiente, DNI);

        //Sobrecargar el constructor
        int saldoBanco = 40;
        cuentaCorriente c2 = new cuentaCorriente(saldoBanco);

        //Volvermos a sobrecargar el constructor
        int limite = 0;
        cuentaCorriente c3 = new cuentaCorriente(saldoBanco, limite, DNI);

        //sacar dinero
        System.out.println("Introduce la cantidad que desea retirar");
        int cantidad = scanner.nextInt();

        c1.sacarDinero(cantidad);

        //Ingresar dinero
        System.out.println("Introduce la cantidad a ingresar");
        int ingresar = scanner.nextInt();

        c1.ingresarDinero(ingresar);

        //mostrar información de la cuenta.

        c1.informacion();
    }
}

