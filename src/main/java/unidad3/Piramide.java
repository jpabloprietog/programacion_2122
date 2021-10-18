package unidad3;

public class Piramide {
    public static void main(String[] args) {

        int altura = 5;

        for(int i = 0; i < altura; i++){
            for(int j = 0; j < (altura * 2) - 1; j++){
                if(j == (altura -1) - i || j == (altura - 1) + i || i == (altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
