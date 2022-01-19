//Actividad 2: En la clase CuentaCorriente, sobrecargar los constructores para que permitan crear objetos:
//
//solo con el saldo inicial, no serán necesarios los datos del titular.
//Por defecto el límite de descubierto será 0 euros.
//
//con un saldo inicial, con un límite de descubierto y con el DNI del titular de la cuenta.

package unidad4.tarea2;

public class cuentaCorriente {

    private long saldo;
    private long limite;
    private String nombre;
    private String DNI;

    public cuentaCorriente(String nom_cli, String dni) {
        this.nombre = nom_cli;
        this.DNI = dni;
        this.saldo = 0;
        this.limite = -50;
    }

    public cuentaCorriente(int saldoBanco) {
        this.saldo = saldoBanco;
        this.limite = 0;
    }

    public cuentaCorriente(int saldoBanco, int limite, String DNI) {
        this.saldo = saldoBanco;
        this.limite = limite;
        this.DNI = DNI;

    }

    public boolean sacarDinero(int cantidad) {
        boolean puedeSacar = true;
        this.saldo += cantidad;
        if (saldo > 50) {
            System.out.println("No puede sacar dinero");
            puedeSacar = false;
        } else {
            System.out.println("Puede sacar dinero");
        }
        this.saldo = 0;
        return puedeSacar;
    }

    public void ingresarDinero(int ingresar) {
        this.saldo += ingresar;
    }

    public long getSaldo() {
        return saldo;
    }

    public long getLimite() {
        return limite;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void informacion() {
        System.out.println("El saldo es: " + getSaldo());
        System.out.println("El limite es: " + getLimite());
        System.out.println("El nombre es: " + getNombre());
        System.out.println("El DNI es: " + getDNI());
    }
}
