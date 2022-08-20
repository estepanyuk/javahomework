package Tasks;
/*
• Прочитать с консоли целое число
• Найдите сумму его цифр
• Найдите сумму только тех цифр числа, которые являются нечетными числами
• Найдите максимальную цифру числа
*/

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;
        int max = 0;

        while (number > 0) {
            int digit = number % 10;

            sum1 += digit;

            if (digit % 2 == 1){
                sum2 += digit;
            }

            if (max  < digit) {
                max = digit;
            }

            number = number / 10;
        }

        System.out.println("Сумма цифр числа: " + sum1);
        System.out.println("Сумма нечетных цифр числа: " + sum2);
        System.out.println("Максимальная цифра числа: " + max);


    }
}
