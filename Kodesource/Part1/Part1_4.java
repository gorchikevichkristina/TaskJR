package javarush.Kodesource;
/*
4. Напишите Java-программу для печати результата следующих операций.
Тестовые данные:
а. -5 + 8 * 6
б. (55 + 9)% 9
с. 20 + -3 * 5/8
д. 5 + 15/3 * 2 - 8% 3
Ожидаемый результат :
43
1
19
13
 */
public class Part1_4 {
    public static void main(String[] args) {
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}