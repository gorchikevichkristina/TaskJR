package javarush.Kodesource.Part1;

/*
11. Напишите Java-программу для печати области и периметра круга.
Тестовые данные:
Радиус = 7,5
Ожидаемый результат
Периметр = 47.12388980384689
Площадь = 176.71458676442586
 */
public class Part1_11 {
    public static void main(String[] args) {
        double rad = 7.5;
        double pi = 3.14;
        //периметр круга L = 2pi * rad
        //площадь круга S = 2rad/4*pi
        System.out.println("периметр круга" + "=" + 2 * pi * rad);
        System.out.println("площадь круга" + "=" + pi * (rad * rad));
    }
}
