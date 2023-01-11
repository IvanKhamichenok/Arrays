package teachmeskills;

public class Array4 {  public static void main(String[] args){
    double sumMas1=0,sumMas2=0;
    int[] mas1 = new int[5];
    for(int i=0;i<mas1.length;i++){
        mas1[i]=(int)(Math.random()*6);
        System.out.print(mas1[i] +" ");
        sumMas1+=(double)mas1[i]/mas1.length;}
    System.out.println(" ");
    int[] mas2=new int[5];
    for(int i=0;i<mas2.length;i++){
        mas2[i] =(int)(Math.random()*6);
        System.out.print(mas2[i] +" ");
        sumMas2+=(double)mas2[i]/mas2.length;}
    System.out.println(" ");
    if(sumMas1==sumMas2)System.out.println("Средние арифметические значения двух массивов равны");
    else {if(sumMas1>sumMas2)
        System.out.println("Среднее арифметическое значение первого массива больше ");
    else System.out.println("Среднее арифметическое значение второго массива больше ");}
}
}

