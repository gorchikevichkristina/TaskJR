package javarush.Old;
/*
Объединяем массивы
*/

public class t4 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int i = firstArray.length; i < firstArray.length + secondArray.length; i++) {
            resultArray[i] = secondArray[i - firstArray.length];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }

        System.out.println();

        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            resultArray[i + firstArray.length] = secondArray[i];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }

        System.out.println();

        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length + secondArray.length; i++) {
            if (i < firstArray.length) {
                resultArray[i] = firstArray[i];
            } else {
                resultArray[i] = secondArray[i - firstArray.length];
            }
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }

        System.out.println();
        System.out.println();
        System.out.println();

//        int[] array = new int[10];
//
//        System.out.println(Arrays.toString(array));
//
//        Integer[] integers = new Integer[10];
//
//        System.out.println(Arrays.toString(integers));
//
//        String[] strings = new String[10];
//
//        System.out.println(Arrays.toString(strings));


    }
}
