package Zadachi;
//Дано натуральное число. Определить, сколько раз в нем встречается первая цифра.
//        Число вводится с клавиатуры и выводится в консоль ответ

import java.util.Scanner;

public class Zadacha10 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите натуральное число: ");
                int num = scanner.nextInt();
                String numString = String.valueOf(num);
                char firstDigit = numString.charAt(0);
                int count = 0;

                for (int i = 0; i < numString.length(); i++) {
                    if (numString.charAt(i) == firstDigit) {
                        count++;
                    }
                }

                System.out.println("Первая цифра встречается " + count + " раз(a)");
            }
        }
