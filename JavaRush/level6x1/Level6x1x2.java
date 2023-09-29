package javarush.level6x1;

public class Level6x1x2 {
    public static void main(String[] args) {
        String[] str = new String[]{"1", "2", "3", "4", "5"};
        for (int i = 0; i < str.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Индекс массива четный");
            } else if (i == 0) {
                System.out.println("Индекс массива четный");
            } else {
                System.out.println("Индекс массива НЕчетный");
            }
        }
    }
}
