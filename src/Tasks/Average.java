package Tasks;
/*
• Написать программу, вычисляющую среднее арифметическое чисел из некоторого диапазона чисел (например, от 3 до 17)
• Концы диапазона задать переменными, начальное число берите > 1, чтобы было посложнее
• Среднее арифметическое чисел – нужно сумму всех чисел поделить на количество этих чисел
• В этом же классе - найти среднее арифметическое только четных чисел из этого диапазона чисел
*/

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало диапазона: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите конец диапазона: ");
        int b = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int count1 = 0;

        int sum2 = 0;
        int count2 = 0;

        for (int i = a; i <= b; i++) {
            sum1 += i;
            count1 += 1;

            if (i % 2 == 0) {
                sum2 += i;
                count2 += 1;
            }
        }

        int avg1 = sum1 / count1;
        int avg2 = sum2 / count2;

        System.out.println("Среднее арифметическое чисел: " + sum1 + " / " + count1 + " = " + avg1);
        System.out.println("Среднее арифметическое четных чисел: " + sum2 + " / " + count2 + " = " + avg2);
    }
}
