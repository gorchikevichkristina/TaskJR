package javarush.Kodesource.Part1;
//15. �������� ��������� �� Java ��� ������ ���� ����������.

public class Part1_15 {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        a = a ^ b ^ (b = a);
        System.out.println(" a " + " = " + a);
        System.out.println(" b " + " = " + b);
    }
}
