package javarush.Kodesource.DataTypes;

import java.util.Scanner;

/*
1. Напишите Java-программу для преобразования температуры из Фаренгейта в градусы Цельсия. Перейти к редактору
Тестовые данные
Введите степень в градусах Фаренгейта: 212
Ожидаемый результат:
212.0 градусов по Фаренгейту равна 100.0 по Цельсию
 */
public class DataTypesTask_1 {
    public static void main(String[] args) {
        //(212°F-32)×5/9 = 100°C
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int conv = (num - 32) * 5 / 9;
        System.out.println(conv);

    }

}
