package JR.Kodesource;
//1. Напишите программу на Java, которая напечатает «Hello» на экране, а затем напечатайте свое имя в отдельной строке.
//        Ожидаемый результат :
//        Привет
//        Александра Абрамова

import java.util.Scanner;

public class Part1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        System.out.println("Hello");
        System.out.println(name);

    }
}
