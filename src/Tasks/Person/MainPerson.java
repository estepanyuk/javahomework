package Tasks.Person;

import java.util.Scanner;
/*
• Выполнить практику 4 с урока
• В класс Person добавить поле age
• Реализовать геттер и сеттер для поля age
• Сделать метод для получения года рождения человека
• В классе Main создать объект класса Person, установить ему значение поля age и вывести на экран год рождения человека
 */

public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String familyName = scanner.nextLine();

        int age;
        do {
            System.out.print("Введите возраст (положительный): ");
            age = Integer.parseInt(scanner.nextLine());
        } while (age <= 0);

        Person person = new Person(name, middleName, familyName, age);

        System.out.println("Объект класса Person был создан:\n" + person);
        System.out.println("Год рождения: " + person.getBirthYear());
    }
}
