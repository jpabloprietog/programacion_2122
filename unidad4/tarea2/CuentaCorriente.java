package unidad4.tarea2;

public class CuentaCorriente {

    private long saldo;
    private long limite;
    private String nombre;
    private String DNI;

    public CuentaCorriente(String nombreCliente, String dni) {
        this.nombre = nombreCliente;
        this.DNI = dni;
        this.saldo = 0;
        this.limite = -50;
    }

    public CuentaCorriente(int saldoBanco, int limite, String DNI) {
        this.saldo = saldoBanco;
        this.limite = limite;
        this.DNI = DNI;
    }

    public boolean sacarDinero(int cantidad) {
        boolean puedeSacar = true;
        this.saldo += cantidad;
        if (saldo > 50) {
            System.out.println("No puedes sacar dinero");
            puedeSacar = false;
        } else {
            System.out.println("Puedes sacar dinero");
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
        System.out.println("El saldo es " + getSaldo());
        System.out.println("El limite es " + getLimite());
        System.out.println("El nombre es " + getNombre());
        System.out.println("El DNI es " + getDNI());
    }
}
