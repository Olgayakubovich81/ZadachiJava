package Zadachi;

//Определить, является ли треугольник со сторонами a, b, c равнобедренным.
//        Возможно ввести стороны треугольника и получить ответ
//        Число вводится с клавиатуры и выводится в консоль ответ

import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Введите число: ");
//        int a = sc.nextInt();
//        System.out.println("Введите число: ");
//        int b = sc.nextInt();
//        System.out.println("Введите число: ");
//        int c = sc.nextInt();
//
//        if (a == b || a == c || b == c) {
//            System.out.println("Треугольник равнобедренный");
//        } else {
//            System.out.println("Треугольник неравнобедренный");
//
//        }


        System.out.println("Введите значение длины треугольника: ");

        double sideA;
        double sideB;
        double sideC;
        while (true) {
            System.out.println(" Введите значение стороны А ");
            sideA = sc.nextDouble();
            System.out.println("Введите значение стороны B");
            sideB = sc.nextDouble();
            System.out.println("Введите значение стороны C");
            sideC = sc.nextDouble();

            if (sideA > 0 && sideB > 0 && sideC > 0) {
                break;
            }

            System.out.println(" Пожалуйста введите правильное число ");
        }
        //System.out.println(sideA + " " + sideB + " " + sideC);
        if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("Поздраввляю! Ваш треугольник равнобедренный!");
        } else {
            System.out.println("Ваш треугольник не совсем равнобедренный");
        }


    }

}
