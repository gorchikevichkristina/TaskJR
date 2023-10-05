package javarush.Level6x3;

import java.util.Scanner;

//revers
public class Level6x3x1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //вводим число н
        int n = scanner.nextInt();

        //делаем проверку больше 0 или меньше
        if (n > 0) { //после проверки в блоке делаем остальное
            int[] array = new int[n]; // создаем массив с количеством элементов н

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            if (n % 2 != 0) {//нечетное
                for (int i = 0; i < n; i++) {
                    System.out.println(array[i]);
                }
            } else {//четное
                for (int i = n - 1; i >= 0; i--) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
