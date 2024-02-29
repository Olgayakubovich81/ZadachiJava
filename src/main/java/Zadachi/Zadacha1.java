package Zadachi;
//В трехзначном числе x зачеркнули его вторую цифру.
//        Когда к образованному при этом двузначному числу слева приписали вторую цифру числа x,
//        то полу- чилось число 546. Найти число x.
//        Написать код  и вывести ответ в консоль

public class Zadacha1 {
    public static void main(String[] args) {

        int num = 546;
        int x = num / 10 % 10 * 100 + num / 100 * 10 + num % 10;

        System.out.println(num % 10); // 6
        System.out.println(num / 100); // 5
        System.out.println(num / 10 % 10); // 4

    }
}




