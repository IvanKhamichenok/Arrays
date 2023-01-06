package TeachMeSkills;

import java.util.Arrays;
import java.util.Random;

public class MultiArrays1 {
    public static void main(String[] args) {
        int r = 0;
        String[][][] array = new String[5][3][2];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) { // length - количество строк в массиве
            for (int j = 0; j < array[i].length; j++) {

                    array[i][j][r] = String.valueOf(random.nextInt(10)); // заполнение случайными числами
                }  for (String[][] element : array) { // вывод на экран в виде таблицы
                System.out.println(Arrays.toString(element));
            }


        }
    }
}

