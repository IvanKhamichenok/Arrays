package teachmeskills;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
    int[] massive = {2, 11, 8, 12, 19, 1, 10, 15, 7, 20};
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число ,чтобы узнать, входит ли оно в массив: ");
    int a = sc.nextInt();
    for(int i=0;i< massive.length;i++) {
        if (massive[i]==a) {
            System.out.println("Такое число есть в массиве.");
            break;}
        if(i==massive.length-1)System.out.println("Нет такого числа в массиве.");}
    System.out.println("Введите число, чтобы узнать, входит ли оно в массив.: ");
    a = sc.nextInt();
    }
}


