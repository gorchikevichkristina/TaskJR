package javarush.Level6x8;

import java.util.Arrays;

//заполняем массив
/*
1, если длина массива четная то его первую половину заполняем valueStart
2. если нечетная то большую част заполнить valueStart
 */
public class Level6x8x1 {
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, firstPart, valueStart);
        Arrays.fill(array, firstPart, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
