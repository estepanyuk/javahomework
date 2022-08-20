package Tasks;
/*
• Написать программу, вычисляющую среднее арифметическое чисел из некоторого диапазона чисел (например, от 3 до 17)
• Концы диапазона задать переменными, начальное число берите > 1, чтобы было посложнее
• Среднее арифметическое чисел – нужно сумму всех чисел поделить на количество этих чисел
• В этом же классе - найти среднее арифметическое только четных чисел из этого диапазона чисел
*/

public class Average {
    public static void main(String[] args) {

        int a = 3;
        int b = 17;

        int sum = 0;
        int count = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
            count += 1;
            System.out.print(i + " ");
        }

        int avg = sum / count;

        System.out.println("\nСреднее арифметическое чисел - " + sum + " / " + count + " = " + avg);

        sum = 0;
        count = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
                count += 1;
                System.out.print(i + " ");
            }
        }

        avg = sum / count;
        System.out.println("\nСреднее арифметическое четных чисел - " + sum + " / " + count + " = " + avg);
    }

}
