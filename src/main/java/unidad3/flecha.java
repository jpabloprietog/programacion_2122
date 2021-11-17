package unidad3;

public class flecha {

    public static void main(String[] args) {

        int altura = 5;

        for (int fila = 1; fila <= altura; fila++) {
            for (int col = 1; col <= altura; col++) {
                if (col == (altura / 2 + 1) - (fila - 1) || col == fila - (altura / 2)) {
                    System.out.print("*     *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
