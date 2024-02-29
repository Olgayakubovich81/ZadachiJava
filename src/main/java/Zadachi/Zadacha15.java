package Zadachi;
//Дано слово  = “picture” .
// Получить и вывести на экран в консоль буквосочетание,
// состоящее из его третьего и последнего символа
public class Zadacha15 {
    public static void main(String[] args) {
        String str= "picture";
        System.out.println (str.substring(2, 3) + str.charAt(str.length() - 1));
    }

}
