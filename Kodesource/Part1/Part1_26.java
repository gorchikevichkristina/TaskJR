package javarush.Kodesource.Part1;
/*
26. Ќапишите программу на Java дл€ преобразовани€ восьмеричного числа в двоичное число.
¬ходные данные:
¬ведите любое восьмеричное число: 7
ќжидаемый результат

 Ёквивалентное двоичное число: 111
 */
public class Part1_26 {
    public static void main(String[] args) {
        int n = 7;
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
    }
}
