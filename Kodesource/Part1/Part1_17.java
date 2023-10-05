package javarush.Kodesource.Part1;

import java.util.Scanner;

/*
17. Ќапишите программу на Java, чтобы добавить два двоичных числа.
¬ходные данные:
¬ведите первое двоичное число: 10
¬ведите второе двоичное число: 11
ќжидаемый результат

 —умма двух двоичных чисел: 101
 */
public class Part1_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите первое двоичное число:");
        int num1 = scanner.nextInt();
        System.out.println("¬ведите второе двоичное число:");
        int num2 = scanner.nextInt();

        //считаем общую сумму двух чисел
        int sum = num1 + num2;

        //—читаем номер старшего значащего бита суммы
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
