package com.company;

//Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
//Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено
//до двух знаков после запятой. (Пример для теста работы программы:
//Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan_exc = new Scanner(System.in);

        System.out.println("Введите текущий курс доллара: ");
        double rate = scan_exc.nextDouble();
        System.out.println("Введите количество рублей: ");
        double amount = scan_exc.nextDouble();

        try {
            double exchange = amount/rate;
            System.out.println(String.format("%(.2f", exchange));

        } catch (ArithmeticException exc) {
            System.out.println("Введите корректный курс" + exc);
        }
    }
}
