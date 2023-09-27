package JR;
//поменять значение элемента массива на противоположное
public class t2 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = -array[i];
            }
            System.out.println(array[i]);
        }
    }
}
