package javarush.Kodesource;
/*
22. Напишите программу на Java для преобразования двоичного числа в десятичное число.
Входные данные:
Введите двоичное число: 100
Ожидаемый результат

 Десятичное число: 4
 */
public class Part1_22 {
    public static void main(String[] args) {
        int num = 100;
//число 100 в двоичной системе
        System.out.println(Integer.toBinaryString(num));
//обратный перевод из двоичной системы в десятичную
        System.out.println(Integer.parseInt("100", 2));
    }
}
