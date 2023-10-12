package javarush.Level6x8;

import java.util.Arrays;

//есть ли кто
public class Level6x8x4 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int [] array2 = Arrays.copyOf(array, array.length);
        Arrays.sort(array2);
        int in = Arrays.binarySearch(array, element);
        System.out.println(in);
        if (in >= element) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
