package Zadachi;
//Среди чисел 1, 4, 9, 16, 25, ... найти первое число, большее n.
//        N  вводим с клавиатуры – ответ выводим

import java.util.Scanner;

public class Zadacha9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n = sc.nextInt();

        for (int i = 1; ; i++)
        {
            int square = i * i;
            if (square>n ) {

                System.out.println(square);
                break;
            }
        }
    }
}
