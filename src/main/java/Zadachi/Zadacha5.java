package Zadachi;

//Определить, является ли треугольник со сторонами a, b, c равнобедренным.
//        Возможно ввести стороны треугольника и получить ответ
//        Число вводится с клавиатуры и выводится в консоль ответ

import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = sc.nextInt();
        System.out.println("Введите число: ");
        int b = sc.nextInt();
        System.out.println("Введите число: ");
        int c = sc.nextInt();

        if (a == b || a == c && b == c) {
            System.out.println("Треугольник равнобедренный");
        } else {
            System.out.println("Треугольник неравнобедренный");

        }
    }
}
