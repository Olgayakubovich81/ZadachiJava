package Zadachi;
//В трехзначном числе x зачеркнули его вторую цифру.
//        Когда к образованному при этом двузначному числу слева приписали вторую цифру числа x,
//        то полу- чилось число 546. Найти число x.
//        Написать код  и вывести ответ в консоль

public class Zadacha1 {
    public static void main(String[] args) {

                for (int x = 100; x < 1000; x++) {
                    int firstDigit = x / 100;
                    int thirdDigit = x % 10;

                    int formedNumber = firstDigit * 10 + thirdDigit;


                    if (formedNumber * 10 + (x / 10 % 10) == 546) {
                        System.out.println("Число x: " + x);
                        break;
                    }
                }
            }
        }



