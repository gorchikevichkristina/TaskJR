package javarush.Kodesource.DataTypes;

import java.util.Scanner;

/*
2. �������� ��������� �� Java, ������� ��������� ����� � ������ � ����������� ��� � �����. ������� � ���������
����������. ���� ���� ����� 0,0254 �����.
�������� ������
������� �������� ��� �����: 1000
��������� ���������:
1000,0 ����� - ��� 25,4 �����
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
