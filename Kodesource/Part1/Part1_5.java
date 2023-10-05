package javarush.Kodesource.Part1;

import java.util.Scanner;

/*
5. Напишите программу Java, которая принимает два числа в качестве входных данных и отображает произведение двух чисел.
Перейти к редактору
Тестовые данные:
Введите первое число: 25
Введите второе число: 5
Ожидаемый результат:
25 х 5 = 125
 */
public class Part1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число :");
        int a = scanner.nextInt();
        System.out.println("Введите второе число :");
        int b = scanner.nextInt();
        System.out.println("Результат :" + a * b);

    }
}
