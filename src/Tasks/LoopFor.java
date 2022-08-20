package Tasks;
/*
• Распечатать числа, кратные четверке от 1 до 100, причем в обратном порядке (то есть, начиная с 100)
• Определение кратности четверке вынести в отдельную функцию
• Использовать цикл for
*/

public class LoopFor {
    public static void main(String[] args) {

        int a = 1;
        int b = 100;

        System.out.println("\nКоличество - " + getFour(a, b));
    }

    public static int getFour(int a, int b){
        int count = 0;
        for (int i = b; i >= a; i--) {
            if (i % 4 == 0) {
                count += 1;
                System.out.print(i + " ");
            }
        }
        return count;
    }
}
