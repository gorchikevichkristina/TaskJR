package javarush.Help;
/*
24. �������� ��������� �� Java ��� �������������� ��������� ����� � ������������ �����. ������� � ���������
������� ������:
������� �������� �����: 111
��������� ���������

 ������������ �����: 7
 */
public class Part1_24 {
    public static void main(String[] args) {
        String n = "111";
        int num = Integer.parseInt(n, 8);
        System.out.println(num);
    }
}
