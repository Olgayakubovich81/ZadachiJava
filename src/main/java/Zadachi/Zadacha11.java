package Zadachi;
//Дано натуральное число.
//        а) Определить две его максимальные цифры.
//        б) Определить две его минимальные цифры.
//        Число вводится с клавиатуры и выводится в консоль ответ

import java.util.Scanner;

public class Zadacha11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int num = scanner.nextInt();
        String numString = String.valueOf(num);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;


                    for (int i = 0; i < numString.length(); i++) {
                        int digit = Character.getNumericValue(numString.charAt(i));

                        if (digit > max1) {
                            max2 = max1;
                            max1 = digit;
                        } else if (digit > max2 && digit != max1) {
                            max2 = digit;
                        }

                        if (digit < min1) {
                            min2 = min1;
                            min1 = digit;
                        } else if (digit < min2 && digit != min1) {
                            min2 = digit;
                        }
                    }

                    System.out.println("Две максимальные цифры: " + max1 + " и " + max2);
                    System.out.println("Две минимальные цифры: " + min1 + " и " + min2);
                }
            }



