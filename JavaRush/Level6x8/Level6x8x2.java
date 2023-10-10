package javarush.Level6x8;

import java.util.Arrays;

//делим массив
public class Level6x8x2 {
    public static int[][] result = new int[2][]; //заполнить под массивами
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22}; //поделить на 2 под массива

    public static void main(String[] args) {
        //напишите тут ваш код
        //Arrays.copyOfRange(int[], int, int)
        if (array.length % 2 != 0) {
            int[] arr1 = Arrays.copyOf(array, array.length / 2 + 1);
            int[] arr2 = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);
            result[0] = arr1;
            result[1] = arr2;
        } else {
            int[] arr1 = Arrays.copyOf(array, array.length / 2);
            int[] arr2 = Arrays.copyOfRange(array, array.length / 2, array.length);
            result[0] = arr1;
            result[1] = arr2;
        }
        System.out.println(Arrays.deepToString(result));
    }
}

/*
Эталонное решение

        int arr1 = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
             result[0] = Arrays.copyOfRange(array, 0, arr1);
             result[1] = Arrays.copyOfRange(array, arr1, array.length);
           System.out.println(Arrays.deepToString(result));
 */