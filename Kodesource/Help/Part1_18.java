package javarush.Kodesource.Help;

import java.util.Scanner;

/*
18. Напишите программу на Java для умножения двух двоичных чисел.
Входные данные:
Введите первое двоичное число: 10
Введите второе двоичное число: 11
Ожидаемый результат

 Произведение двух двоичных чисел: 110
 */
public class Part1_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое двоичное число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе двоичное число:");
        int num2 = scanner.nextInt();

        //считаем произведение двух чисел
        int sum = num1 * num2;

        //Считаем номер старшего значащего бита суммы
        int n = 0;
        while (sum != 0) {
            sum = sum / 2;
            n++;
        }
        System.out.println(n);

        //переводим в двоичную систему 0 и 1
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
    }
}
