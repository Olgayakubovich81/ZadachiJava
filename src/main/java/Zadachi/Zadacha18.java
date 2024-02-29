package Zadachi;
//Проверить, заканчивается ли строка  “first meaning in the row” подстрокой “!!! Вывести yes/no
public class Zadacha18 {
           public static void main(String[] args) {
            String s = "first meaning in the row";
            String substring = "!!!";

            if (s.endsWith(substring)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }


