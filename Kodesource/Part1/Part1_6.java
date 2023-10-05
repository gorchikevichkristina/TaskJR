package javarush.Kodesource.Part1;

import java.util.Scanner;

/*
6. Напишите Java-программу для печати суммы (сложения), умножения, вычитания, деления и остатка двух чисел.
Тестовые данные:
Введите первое число: 125
Введите второе число: 24
Ожидаемый результат :
125 + 24 = 149
125 - 24 = 101
125 х 24 = 3000
125/24 = 5
125 мод 24 = 5
 */
public class Part1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число :");
        int a = scanner.nextInt();
        System.out.println("Введите второе число :");
        int b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }
}
