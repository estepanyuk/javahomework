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
        int start = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите конец диапазона: ");
        int finish = Integer.parseInt(scanner.nextLine());

        int sumAll = 0;
        int countAll = 0;

        int sumEven = 0;
        int countEven = 0;

        for (int i = start; i <= finish; i++) {
            sumAll += i;
            countAll += 1;

            if (i % 2 == 0) {
                sumEven += i;
                countEven += 1;
            }
        }

        int avgAll = sumAll / countAll;
        int avgEven = sumEven / countEven;

        System.out.println("Среднее арифметическое чисел: " + sumAll + " / " + countAll + " = " + avgAll);
        System.out.println("Среднее арифметическое четных чисел: " + sumEven + " / " + countEven + " = " + avgEven);
    }
}
