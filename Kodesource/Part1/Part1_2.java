package JR.Kodesource;
//2. Напишите программу на Java для вывода суммы двух чисел.
//        Тестовые данные:
//        74 + 36
//        Ожидаемый результат :
//        110

import java.util.Scanner;

public class Part1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1+num2);
    }
}
