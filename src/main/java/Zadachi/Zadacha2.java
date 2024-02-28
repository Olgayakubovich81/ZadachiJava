package Zadachi;
//Написать код Число вводится с клавиатуры и выводится в консоль ответ
//        Если целое число m делится нацело на целое число n,
//        то вывести на экран ча-стное от деления, в противном случае
//        вывести сообщение "m на n нацело не делится".

import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Введите число: ");
        int m= sc.nextInt();
        System.out.println("Введите еще одно число: ");
        int n= sc.nextInt();

        if (m%n==0) {
            System.out.println("Результат деления равен: " + (m/n));

        }
        else {
            System.out.println("m на n нацело не делится");
        }

    }
}
