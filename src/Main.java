import java.util.Scanner;
import com.taskManager.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        taskManager.printMenu();
        var input = scanner.nextInt();
        taskManager.processMenuInput(input);
    }
}