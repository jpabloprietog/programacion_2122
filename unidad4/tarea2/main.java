package unidad4.tarea2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Creamos la cuenta corriente

        System.out.println("Introduce el nombre completo");
        String nombreCliente = scanner.nextLine();

        System.out.println("Introduce el DNI");
        String DNI = scanner.next();

        cuentaCorriente c1 = new cuentaCorriente(nombreCliente, DNI);

        //Sobrecargar el constructor
        int saldobanco = 40;
        cuentaCorriente c2 = new cuentaCorriente(saldobanco);

        //Volvemos a sobrecargar el constructor
        int limite = 0;
        cuentaCorriente c3 = new cuentaCorriente(saldobanco, limite, DNI);

        //Sacar dinero
        System.out.println("Introduzca la cantidad que desea retirar");
        int cantidad = scanner.nextInt();

        c1.sacarDinero(cantidad);

        //Ingresar dinero
        System.out.println("Introduzca la cantidad a ingresar");
        int ingresar = scanner.nextInt();

        c1.ingresarDinero(ingresar);

        //mostrar información de la cuenta
        c1.informacion();
    }
}
