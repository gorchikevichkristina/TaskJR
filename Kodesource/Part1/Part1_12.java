package javarush.Kodesource;

import java.util.Scanner;

/*
12. Напишите программу на Java, которая принимает три числа в качестве входных данных для вычисления и печати среднего числа.
 */
public class Part1_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int c = scanner.nextInt();
        System.out.println("среднее арифметическое" + " = " + (a + b + c) / 3);

    }
}
