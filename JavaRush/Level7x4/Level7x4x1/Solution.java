package javarush.Level7x4.Level7x4x1;

/*
������ �� ������
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person("����", "������");
        System.out.println("�����.");
        System.out.println("���: " + person.getFirstName());
        System.out.println("�������: " + person.getLastName());
        System.out.println("������ ���: " + person.getFullName());
    }
}