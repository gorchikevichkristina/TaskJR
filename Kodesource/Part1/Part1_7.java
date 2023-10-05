package javarush.Kodesource.Part1;

import java.util.Scanner;

/*
7. Напишите программу на Java, которая принимает число в качестве входных данных и печатает свою таблицу умножения до 10.
Тестовые данные:
Введите число: 8
Ожидаемый результат :
8 х 1 = 8
8 х 2 = 16
8 х 3 = 24
...
8 х 10 = 80
 */
public class Part1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число :");
        int a = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(a + "*" + i + " =" + (a * i));
        }
    }
}
