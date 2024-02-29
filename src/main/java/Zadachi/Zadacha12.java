package Zadachi;

import java.util.Scanner;

//Дано натуральное число. Установить, является ли последовательность его
//        цифр при просмотре их слева направо упорядоченной по возрастанию.
//        Например, для числа 1478 ответ положительный, для чисел 1782 и 1668 — отрицательный и т. п.
public class Zadacha12 {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите натуральное число: ");
                int num = scanner.nextInt();
                String numString = String.valueOf(num);
                boolean isOrdered = true;

                for (int i = 1; i < numString.length(); i++) {
                    if (numString.charAt(i) < numString.charAt(i - 1)) {
                        isOrdered = false;
                        break;
                    }
                }

                if (isOrdered) {
                    System.out.println("Последовательность цифр упорядочена по возрастанию.");
                } else {
                    System.out.println("Последовательность цифр не упорядочена по возрастанию.");
                }
            }
        }


