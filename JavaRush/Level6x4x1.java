package javarush;

import java.util.Scanner;

public class Level6x4x1 {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String element = strings[i];
            for (int j = 0; j < strings.length; j++) {
                if (element != null && i != j && element.equals(strings[j])) {
                    strings[j] = null;
//                    strings[i] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }

    }
}
