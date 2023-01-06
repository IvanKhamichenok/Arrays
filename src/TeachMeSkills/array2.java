package TeachMeSkills;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[] massive = {2, 11, 8, 12, 19, 1, 10, 15, 7, 20};
    Scanner sc = new Scanner(System.in);


    System.out.println("Введите число ,чтобы удалить его из массива: ");
    int a = sc.nextInt();
    int b = a+1 ;



    for(int i=0;i< massive.length;i++)
    {
        if (massive[i]==a) {
            massive [b] = 0 ;

            System.out.println("число удалено");
            break;
        }
        if(i==massive.length-1)System.out.println("Нет такого числа в массиве.");
    }
}
}

