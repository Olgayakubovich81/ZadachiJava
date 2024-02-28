package Zadachi;
//Составить программу, которая в зависимости от порядкового
// номера дня ме- сяца (1, 2, ..., 12) выводит на экран время года,
//        к которому относится этот месяц.

import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер месяца от одного до 12: ");
        int num = sc.nextInt();
        defineSeason(num);
    }

        public static void defineSeason (int num){

            if (num == 12 || num == 1 || num == 2) {
                System.out.println("Зима");
            } else if (num >= 3 && num <= 5) {
                System.out.println("Весна");
            } else if (num >= 6 && num <= 8) {
                System.out.println("Лето");
            } else if (num >= 9 && num <= 11) {
                System.out.println("Осень");
            } else {
                System.out.println("Некорректный номер месяца");
            }
        }
}



