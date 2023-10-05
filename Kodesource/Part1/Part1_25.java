package javarush.Kodesource.Part1;
/*
25. Напишите программу на Java для преобразования восьмеричного числа в десятичное число. Перейти к редактору
Входные данные:
Введите любое восьмеричное число: 10
Ожидаемый результат

 Эквивалентное десятичное число: 8
 */
public class Part1_25 {
    public static void main(String[] args) {
        String n = "10";
        int num = Integer.parseInt(n, 8);
        System.out.println(num);
    }
}
