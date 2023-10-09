package javarush.Level6x6;

import java.util.Arrays;
import java.util.Scanner;

//создаем двумерный массив
public class Level6x6x2 {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        multiArray = new int[a][];
        for (int i = 0; i < multiArray.length; i++) {
            int size = n.nextInt();
            multiArray[i] = new int[size];{
            }
        }
    }
}
