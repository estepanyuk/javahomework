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

        for (int i = b; i >= a; i--) {
            if (isFour(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isFour(int number){
        return number % 4 == 0;
    }
}
