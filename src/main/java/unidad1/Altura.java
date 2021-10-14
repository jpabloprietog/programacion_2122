package unidad1;

public class Altura {

    public static void main(String[] args) {

        int altura = 5;
        String Chracter = "*";

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.println(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.println(Chracter);
            }
        }
    }
}
