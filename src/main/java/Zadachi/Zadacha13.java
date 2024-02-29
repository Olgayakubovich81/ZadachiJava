package Zadachi;

//        Найти сумму положительных нечетных чисел, меньших 50. Написать на это код

public class Zadacha13 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < 50; i++) {
            if (i%2!=0) {
                sum= sum+i;
                System.out.println(sum);
            }

        }

    }
}
