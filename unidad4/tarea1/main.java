package unidad4.tarea1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre_cliente;
        String DNI;
        int cantidad;
        int ingresar;

        //Creamos la cuenta corriente

        System.out.println("Introduzca el nombre completo");
        nombre_cliente = scanner.nextLine();

        System.out.println("Introduzca el DNI");
        DNI = scanner.nextLine();

        CuentaCorriente c1 = new CuentaCorriente(nombre_cliente, DNI);

        //sacar dinero

        System.out.println("Introduzca la cantidad que desea retirar");
        cantidad = scanner.nextInt();

        c1.sacarDinero(cantidad);

        //Ingresar dinero

        System.out.println("Introduzca la cantidad que desea ingresar");
        ingresar = scanner.nextInt();

        c1.ingresarDinero(ingresar);

        //Mostrar información de la cuenta

        c1.informacion();

    }
}
