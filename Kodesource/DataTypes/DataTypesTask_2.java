package javarush.Kodesource.DataTypes;

import java.util.Scanner;

/*
2. Напишите программу на Java, которая считывает число в дюймах и преобразует его в метры. Перейти к редактору
Примечание. Один дюйм равен 0,0254 метра.
Тестовые данные
Введите значение для дюйма: 1000
Ожидаемый результат:
1000,0 дюйма - это 25,4 метра
 */
public class DataTypesTask_2 {
    public static void main(String[] args) {
        //1000" * 0.0254 = 25.4m
        Scanner scanner = new Scanner(System.in);
        double  num = scanner.nextInt();
        double  conv = num * 0.0254;
        System.out.println(conv);

    }
}
