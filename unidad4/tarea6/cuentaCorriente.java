package unidad4.tarea6;

public class cuentaCorriente {

    //Atributos de la clase cuentaCorriente.
    private long saldo;
    private long limite;
    public String nombre;
    String DNI;

    public cuentaCorriente(String nombreCLiente, String dni) {
        this.nombre = nombreCLiente;
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
        System.out.println("El saldo es: " + getSaldo());
        System.out.println("El limite es: " + getLimite());
        System.out.println("El nombre es: " + getNombre());
        System.out.println("El DNI es: " + getDNI());
    }
}
