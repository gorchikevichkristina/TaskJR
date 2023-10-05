package javarush.Level6x3;

import java.util.Scanner;
//максимальное из N чисел
public class Level6x3x3 {
    public static void main(String[] args) {
        //код
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];

        for (int i = 0; i < 10; i++) {
            if (array[i] > max)
                max = array[i];

        }
        System.out.println(max);
    }
}

