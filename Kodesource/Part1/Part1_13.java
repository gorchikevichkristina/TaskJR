package javarush.Kodesource.Part1;
/*
13. Напишите Java-программу для печати площади и периметра прямоугольника.
Тестовые данные:
Ширина = 5,5 Высота = 8,5
 */
public class Part1_13 {
    public static void main(String[] args) {
        double width = 5.5;
        double height = 8.5;
        System.out.println("периметр прямоугольника" + "=" + (width + height)*2);
        System.out.println("площадь прямоугольника" + "=" + width * height);

    }
}
