package javarush.Level7x2;

import java.util.Arrays;

public class Level7x2x3 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] tmpArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < tmpArray.length; i++) {
            array[i] = tmpArray[tmpArray.length - 1 - i];
        }
        //напишите тут ваш код
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();

    }
}
