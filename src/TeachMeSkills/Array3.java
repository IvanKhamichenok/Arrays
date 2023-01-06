package TeachMeSkills;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[(int) i] = (int)(Math.random()*10);
        }
        int max = array[0];
        int min = array[0];
        for (int v : array) {
            if (max < v)
                max = v;
            if (min > v)
                min = v;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}