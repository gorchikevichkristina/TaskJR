package javarush.Kodesource;

/*
21. Напишите программу на Java для преобразования десятичного числа в восьмеричное число. Перейти к редактору
Входные данные:
Введите десятичное число: 15
Ожидаемый результат

 Восьмеричное число: 17
 */
public class Part1_21 {
    public static void main(String[] args) {
        int a = 15;
        int n = 0;
        while (a != 0 ) {
            a = a % 2;
            n++;

        }
    }
}
