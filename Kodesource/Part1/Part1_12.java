package javarush.Kodesource;

import java.util.Scanner;

/*
12. �������� ��������� �� Java, ������� ��������� ��� ����� � �������� ������� ������ ��� ���������� � ������ �������� �����.
 */
public class Part1_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �����");
        int a = scanner.nextInt();
        System.out.println("������� ������ �����");
        int b = scanner.nextInt();
        System.out.println("������� ������ �����");
        int c = scanner.nextInt();
        System.out.println("������� ��������������" + " = " + (a + b + c) / 3);

    }
}
