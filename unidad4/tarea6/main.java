package unidad4.tarea6;

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
        int saldoBanco = 40;
        cuentaCorriente c2 = new cuentaCorriente(saldoBanco);

        //Volvemos a sobrecargar el constructor
        int limite = 0;
        cuentaCorriente c3 = new cuentaCorriente(saldoBanco, limite, DNI);

        //sacar dinero
        System.out.println("Introduce la cantidad a ingresar");
        int ingresar = scanner.nextInt();

        c1.ingresarDinero(ingresar);

        //mostrar informacion de la cuenta

        c1.informacion();
    }
}
