package javarush.Kodesource.Part1;

/*
11. �������� Java-��������� ��� ������ ������� � ��������� �����.
�������� ������:
������ = 7,5
��������� ���������
�������� = 47.12388980384689
������� = 176.71458676442586
 */
public class Part1_11 {
    public static void main(String[] args) {
        double rad = 7.5;
        double pi = 3.14;
        //�������� ����� L = 2pi * rad
        //������� ����� S = 2rad/4*pi
        System.out.println("�������� �����" + "=" + 2 * pi * rad);
        System.out.println("������� �����" + "=" + pi * (rad * rad));
    }
}
