package teachmeskills;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultiArrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на которое увеличится значение в массиве " );
        int n = scanner.nextInt();
        int r = 0;
        String[][][] array = new String[3][3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j][r] = String.valueOf(random.nextInt(10)+n);
                }
            for (String[][] element : array) System.out.println(Arrays.toString(element));
        }
    }
}

