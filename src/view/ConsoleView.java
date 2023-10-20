package view;

import presenter.Presenter;

import java.util.Scanner;

public class ConsoleView {

    public void start () {
        Presenter presenter = new Presenter();
        ConsoleInterf consoleInterf = new ViewInterConsole();
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("\033[1;34m***Выбирай, что будем делать***\033[0m");
                System.out.println(
                        "\033[1;34m1\033[0m - Посмотреть список работников " + "\n" +
                        "\033[1;34m2\033[0m - Добавить нового работника" + "\n" +
                        "\033[1;34m3\033[0m - Удалить работника по табельному номеру" + "\n" +
                        "\033[1;34m4\033[0m - Найти сотрудника по стажу работы" + "\n" +
                        "\033[1;34m5\033[0m - Найти сотрудника по номеру телефона" + "\n" +
                        "\033[1;34m6\033[0m - Найти сотрудника по имени" + "\n" +
                        "\n\033[1;35mДля выхода нажмите (0)\033[0m");
                String key = scan.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.showAllAmployees();
                        break;
                    case "2":
                        presenter.addEmployee(consoleInterf.addPersonnelNumber(),
                                consoleInterf.getName(), consoleInterf.getTelephone(), consoleInterf.getExperience());
                        break;
                    case "3":
                        presenter.delAmployeesOfPersonnelNumber(consoleInterf.getPersonnelNumber());
                        break;
                    case "4":
                        presenter.searchByExperience(consoleInterf.getMin(), consoleInterf.getMax());
                        break;
                    case "5":
                        presenter.searchByTelephoneNumber(consoleInterf.getTelephone());
                        break;
                    case "6":
                        presenter.searchByName(consoleInterf.getName());
                        break;
                    case "0":
                        System.out.println("До скорых встреч!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }
}
