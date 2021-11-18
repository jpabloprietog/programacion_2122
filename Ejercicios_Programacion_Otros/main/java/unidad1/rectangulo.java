package Ejercicios.unidad1;

public class rectangulo {

    public static void main(String[] args) {

        int n = 4;
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Introduzca una altura: ");
        //int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
