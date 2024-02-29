package Zadachi;

import java.util.Scanner;

//Дано слово. Вывести на экран его третий символ. Слово вводится с клавиатуры / вывод консоль
public class Zadacha14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Напишите любое слово: ");
        String str= sc.nextLine();

        if (str.length() >= 3) {
            System.out.println("Третий символ этого слова: " + str.charAt(2));
        } else {
            System.out.println("Введено слишком короткое слово");
        }
    }
}


