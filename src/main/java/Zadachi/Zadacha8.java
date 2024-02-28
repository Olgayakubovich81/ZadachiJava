package Zadachi;
//Одна штука некоторого товара стоит 20,4
//        Напечатать таблицу стоимости 2, 3, ..., 20 штук этого товара.

public class Zadacha8 {
    public static void main(String[] args) {

        double num= 20.4;

        for (int i=2; i<=20; i++) {
            System.out.println(num*i);
        }


    }

}
