package TeachMeSkills;

import java.util.Arrays;

public class MultiArrays2 {
    public static void main(String[] args) {
        String[][] mas = new String[8][8];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if ((i + j) % 2 == 0) mas[i][j] += 1;
                System.out.print("B");
                if ((i + j) % 2 == 1) {
                    System.out.println("W");
                }System.out.println();
            }

        }
    }
}
