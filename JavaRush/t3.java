package javarush;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean optim = scanner.nextBoolean();
        double glass = 0.5;
        int x = 0;
        //Math.floor() // округлить вещественное число вниз
        //Math.ceil() // округлить вещественное число вверх
        if (optim) {
            x = (int) Math.ceil(glass);
            System.out.println(x);
        }
        else {
            x = (int) Math.floor(glass);
            System.out.println(x);
        }
    }
}