package javarush.Kodesource;
/*
22. �������� ��������� �� Java ��� �������������� ��������� ����� � ���������� �����.
������� ������:
������� �������� �����: 100
��������� ���������

 ���������� �����: 4
 */
public class Part1_22 {
    public static void main(String[] args) {
        int num = 100;
//����� 100 � �������� �������
        System.out.println(Integer.toBinaryString(num));
//�������� ������� �� �������� ������� � ����������
        System.out.println(Integer.parseInt("100", 2));
    }
}
