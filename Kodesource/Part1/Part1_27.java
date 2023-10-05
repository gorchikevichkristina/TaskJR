package javarush.Kodesource.Part1;
/*
27. Ќапишите программу на Java дл€ преобразовани€ восьмеричного числа в шестнадцатеричное число. ѕерейти к редактору
¬ходные данные:
¬ведите восьмеричное число: 100
ќжидаемый результат

 Ёквивалентное шестнадцатеричное число: 40
 */
public class Part1_27 {
    public static void main(String[] args) {
        String n = "100";
        int n2 = Integer.parseInt(n, 8);
        String n3 = Integer.toHexString(n2);

        System.out.print(n3);
    }
}
