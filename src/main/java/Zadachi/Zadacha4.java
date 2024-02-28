package Zadachi;
//Проверить, принадлежит ли число, введенное с клавиатуры, интервалу (–5, 3).
//        Число вводится с клавиатуры и выводится в консоль ответ

import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = sc.nextInt();

        if (num > -5 && num < 3) {
            System.out.println(num);

        } else {
            System.out.println("Число лежит вне заданного диапазона");
        }

    }
}