package javarush.Level6x3;

import java.util.Scanner;

//����������� �� N �����
public class Level6x3x2 {
    public static void main(String[] args) {
        //���
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];

        for (int i = 0; i < 10; i++) {
            if (array[i] < min)
                min = array[i];

        }
        System.out.println(min);
    }
}
