package JR.Kodesource;

import java.util.Scanner;

/*
3. Напишите программу на Java, чтобы разделить два числа и напечатать на экране.
Тестовые данные:
50/3
Ожидаемый результат :
16
 */
public class Part1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1/num2);
    }
}
