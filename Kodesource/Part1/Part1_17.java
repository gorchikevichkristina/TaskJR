package javarush.Kodesource.Part1;

import java.util.Scanner;

/*
17. �������� ��������� �� Java, ����� �������� ��� �������� �����.
������� ������:
������� ������ �������� �����: 10
������� ������ �������� �����: 11
��������� ���������

 ����� ���� �������� �����: 101
 */
public class Part1_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �������� �����:");
        int num1 = scanner.nextInt();
        System.out.println("������� ������ �������� �����:");
        int num2 = scanner.nextInt();

        //������� ����� ����� ���� �����
        int sum = num1 + num2;

        //������� ����� �������� ��������� ���� �����
        int n = 0;
        while (sum != 0) {
            sum = sum / 2;
            n++;
        }
        System.out.println(n);

        //��������� � �������� ������� 0 � 1
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
    }
}
