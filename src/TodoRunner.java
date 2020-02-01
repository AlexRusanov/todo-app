import java.util.Scanner;

public class TodoRunner {
    public static void run(){
        Todo todo = new Todo();
        todo.initTodo();
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true){
            System.out.print("\n");
            System.out.println("Please, input the day of the week:");
            userInput = scanner.nextLine().trim().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("Thank you for using our application! Goodbye");
                break;
            }

            if (userInput.length() < 6){
                System.out.println("Sorry, I don't understand you, please try again.");
            } else if (userInput.substring(0, 6).equals("change")){
                switch (userInput){
                    case ("change sunday"):
                        setTaskForDay(0, todo, scanner);
                        break;
                    case ("change monday"):
                        setTaskForDay(1, todo, scanner);
                        break;
                    case ("change tuesday"):
                        setTaskForDay(2, todo, scanner);
                        break;
                    case ("change wednesday"):
                        setTaskForDay(3, todo, scanner);
                        break;
                    case ("change thursday"):
                        setTaskForDay(4, todo, scanner);
                        break;
                    case ("change friday"):
                        setTaskForDay(5, todo, scanner);
                        break;
                    case ("change saturday"):
                        setTaskForDay(6, todo, scanner);
                        break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                        break;
                }
            } else {
                switch (userInput){
                    case ("sunday"):
                        todo.printDayScedule(0);
                        break;
                    case ("monday"):
                        todo.printDayScedule(1);
                        break;
                    case ("tuesday"):
                        todo.printDayScedule(2);
                        break;
                    case ("wednesday"):
                        todo.printDayScedule(3);
                        break;
                    case ("thursday"):
                        todo.printDayScedule(4);
                        break;
                    case ("friday"):
                        todo.printDayScedule(5);
                        break;
                    case ("saturday"):
                        todo.printDayScedule(6);
                        break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                        break;
                }
            }
        }
    }

    private static String askTask(int day,Todo todo, Scanner scanner) {
        System.out.println("Please, input new tasks for " + todo.getDayOfWeek(day));
        return scanner.nextLine();
    }

    private static void setTaskForDay(int day, Todo todo, Scanner scanner) {
        todo.setDayScedule(day, askTask(day, todo, scanner));
        System.out.println("Tasks for " + todo.getDayOfWeek(day) + " successfully changed");
    }
}
