import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            TaskManagementService.addTask(scanner);
                            break;
                        case 2:
                            TaskManagementService.editTask(scanner);
                            break;
                        case 3:
                            TaskManagementService.deleteTask(scanner);
                            break;
                        case 4:
                            TaskManagementService.getTaskByDay(scanner);
                            break;
                        case 5:
                            TaskManagementService.printArchivedTasks();
                            break;
                        case 6:
                            TaskManagementService.getGroupedByDate();
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println(
                """
                        1. Добавить задачу
                        2. Редактировать задачу
                        3. Удалить задачу
                        4. Получить задачу на указанный день
                        5. Получить архивные задачи
                        6. Получить сгруппированные задачи по датам
                        0. Выход
                        """
        );
    }
}