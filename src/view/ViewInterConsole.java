package view;

import java.util.Scanner;

/**
 * Класс для работы с вводом значений из консоли
 */
public class ViewInterConsole implements ConsoleInterf {
    Scanner in;
    public ViewInterConsole() {
        in = new Scanner(System.in);
    }
    @Override
    public Integer addPersonnelNumber () {
        int i;
        while (true) {
            System.out.println("\033[1;34m1\033[0m - Введите табельный номер сотрудника");
            try {
                i = Integer.parseInt(in.next());
                return i;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
    }

    @Override
    public String getName() {

        System.out.println("\033[1;34m1\033[0m - Введите имя сотрудника");
        return in.next();
    }
    @Override
    public String getTelephone() {

        System.out.println("\033[1;34m1\033[0m - Введите номер телефона");
        return in.next();
    }
    @Override
    public String getExperience() {
        System.out.println("\033[1;34m1\033[0m - Введите стаж сотрудника через точку (лет.месяцев.дней");
        return in.next();

//        double i;
//        while (true) {
//            System.out.println("\033[1;34m1\033[0m - Введите стаж сотрудника");
//            try {
//                i = Double.parseDouble(in.next());
//                return i;
//            } catch (NumberFormatException e) {
//                System.out.println("Неверный ввод!");
//            }
//        }

    }
    @Override
    public Integer getPersonnelNumber() {
        int i;
        while (true) {
            System.out.println("\033[1;34m1\033[0m - Введите табельный номер сотрудника");
            try {
                i = Integer.parseInt(in.next());
                return i;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }

    }
    @Override
    public Integer getMin() {
        int i;
        while (true) {
            System.out.println("\033[1;34m1\033[0m - Введите минимальное значение стажа сотрудника");
            try {
                i = Integer.parseInt(in.next());
                return i;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
    }
    @Override
    public Integer getMax() {
        int i;
        while (true) {
            System.out.println("\033[1;34m1\033[0m - Введите максимальное значение стажа сотрудника");
            try {
                i = Integer.parseInt(in.next());
                return i;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
    }
}
