package javarush.Level6x7;

import java.util.Arrays;

//выводим двумерные массивы
public class Level6x7x2 {
    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(ints));
        System.out.println(Arrays.deepToString(strings));

    }
}
