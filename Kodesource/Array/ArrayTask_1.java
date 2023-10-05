package javarush.Kodesource.Array;

import java.util.Scanner;

//1. Ќапишите программу на Java дл€ сортировки числового массива и массива строк.
public class ArrayTask_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            int n = scanner.nextInt();
            num[i] = n;
            System.out.println(num[i]);
        }
        System.out.println();

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            String s = scanner.nextLine();
            str[i] = String.valueOf(s);
            System.out.print(str[i]);
        }
    }
}
