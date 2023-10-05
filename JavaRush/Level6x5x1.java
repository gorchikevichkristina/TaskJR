package javarush;

public class Level6x5x1 {
    public static int[][] MULTIPLICATION_TABLE;

    //таблица умножения

    public static void main(String[] args) {
        //int [][] array = new int[ширина][высота];
        //int [][] months = {{31,28,31},{30,31,30},{31,31,30},{31,30,31}};
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                //System.out.print((i + 1) * (j + 1) + " ");
                System.out.printf("%5d",(i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}
