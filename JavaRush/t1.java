package JR;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int number = scanner.nextInt();
        int i = 0;
        do {
            System.out.println(str);
            i++;
        }
        while (i < number && number < 5);
    }
}

