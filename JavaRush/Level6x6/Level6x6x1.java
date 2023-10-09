package javarush.Level6x6;

//треугольный массив
public class Level6x6x1 {
    public static void main(String[] args) {
        int[][] result = new int[10][];

        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
