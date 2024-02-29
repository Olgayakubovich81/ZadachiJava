package Zadachi;
//Дано слово s1 = “meaning”  Получить слово s2, образованное нечетными буквами слова s1.
public class Zadacha16 {
    public static void main(String[] args) {
        String s1="meaning";
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 != 0) {
                s2 += s1.charAt(i);
            }
        }

        System.out.println(s2);
    }
}






