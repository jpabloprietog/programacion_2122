package unidad4;

public class Inverso {

    public static void main(String[] args) {

        long n = 120458;
        long cociente = n;
        long invertido = 0;
        long resto = 0;
        long multiplicador = 1;
        long resto_inicial = 0;

        while (resto_inicial == 0){
            resto_inicial = cociente % 10;
            cociente = cociente / 10;
            multiplicador = multiplicador * 10;
        }
        while (cociente != 0){
            invertido = invertido * multiplicador + cociente % 10;
            cociente = cociente / 10;
            System.out.println(" invertido = " + invertido);
        }

    }
}
