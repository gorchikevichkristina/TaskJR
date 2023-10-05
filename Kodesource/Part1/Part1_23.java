package javarush.Kodesource;
/*
23. Напишите программу на Java для преобразования двоичного числа в шестнадцатеричное число.
Входные данные:
Введите двоичное число: 1101
Ожидаемый результат

 Шестнадцатеричное значение: D
 */
public class Part1_23 {
    public static void main(String[] args) {
        int num = 1101;
        //обратный перевод из двоичной системы в десятичную
        System.out.println(Integer.parseInt("1101", 2));
        System.out.println(Integer.toHexString(13));
    }
}
