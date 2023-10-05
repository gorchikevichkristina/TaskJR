package javarush.Kodesource;
/*
19. Напишите программу на Java для преобразования десятичного числа в двоичное число.
Входные данные:
Введите десятичное число: 5
Ожидаемый результат

 Двоичный номер: 101
 */
public class Part1_19 {
    public static void main(String[] args) {
        int a = 5;
        String bin = Integer.toBinaryString(5);
        System.out.println(bin);
    }
}
