package Zadachi;
//Написать код Число вводится с клавиатуры и выводится в консоль ответ
//        Дано двузначное число. Определить:
//        а) какая из его цифр больше: первая или вторая;
//        б) одинаковы ли его цифры.

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Введите двухзначное число: ");
        int num= sc.nextInt();

                int firstDigit = num/ 10;
                int secondDigit = num % 10;

                if (firstDigit > secondDigit) {
                    System.out.println("Первая цифра больше второй");
                } else if (firstDigit < secondDigit) {
                    System.out.println("Вторая цифра больше первой");
                } else {
                    System.out.println("Цифры равны");
                }
            }
        }



