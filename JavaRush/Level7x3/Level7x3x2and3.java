package javarush.Level7x3;

/*
Кубический калькулятор
*/
public class Level7x3x2and3 {
    public static void main(String[] args) {
    }

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long a) {
        return cube(cube(a));

    }

    //напишите тут ваш код
}

