package Zadachi;
//Дано предложение “Первая буква алфавита всегда – а”
//        Определить, есть ли буква а в нем. В случае положительного
//        ответа найти также порядковый номер первой из них.

public class Zadacha17 {
    public static void main(String[] args) {
        String s = "Первая буква алфавита всегда – а";
        boolean isTrue = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'А') {
                isTrue = true;
                System.out.println("Буква 'а' присутствует в предложении.");
                System.out.println("Порядковый номер первой 'а' в предложении: " + (i + 1));
                break;
            }
        }

        if (!isTrue) {
            System.out.println("Буква 'а' отсутствует в предложении.");
        }
    }
}


