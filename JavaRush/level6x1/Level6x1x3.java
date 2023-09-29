package javarush.level6x1;

public class Level6x1x3 {
    public static void main(String[] args) {
        int[] str = new int[]{-1, 2, 3, -4, -5};
        for (int i = 0; i < str.length; i++) {
            if (str[i] % 2 == 0) {
                str[i] = -str[i];
            }
            System.out.println(str[i]);
        }
    }
}
