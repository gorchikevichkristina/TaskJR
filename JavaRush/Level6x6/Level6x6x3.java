package javarush.Level6x6;

import java.util.Arrays;

//создаем мультимассив
public class Level6x6x3 {
    public static void main(String[] args) {
        int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};
        //System.out.println(Arrays.deepToString(multiArray));
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.println(multiArray[i][j][k]);
                }
            }
        }
    }
}
