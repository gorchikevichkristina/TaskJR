package javarush.Kodesource.Part1;
/*
27. �������� ��������� �� Java ��� �������������� ������������� ����� � ����������������� �����. ������� � ���������
������� ������:
������� ������������ �����: 100
��������� ���������

 ������������� ����������������� �����: 40
 */
public class Part1_27 {
    public static void main(String[] args) {
        String n = "100";
        int n2 = Integer.parseInt(n, 8);
        String n3 = Integer.toHexString(n2);

        System.out.print(n3);
    }
}
