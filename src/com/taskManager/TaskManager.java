package com.taskManager;
import java.util.Scanner;

public class TaskManager {
    public void printMenu()
    {
        System.out.println("Welcome to Task Manager!");
        System.out.println("1. Add Task");
        System.out.println("2. List Tasks");
        System.out.println("3. Update Tasks");
        System.out.println("4. Exit");
        System.out.println("Please Choose Option From Above: ");
    }

    public void processMenuInput(int input)
    {
        Scanner scn = new Scanner(System.in);
        switch (input)
        {
            case 1:
                System.out.print("Enter small description of task");
                var description = scn.next();
                var newTask = new Task(description);
                break;
            case 2:
                System.out.print("List of all tasks");
                break;
            case 3:
                System.out.print("Choose Id for which task to update");
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid Input Please try again");
                printMenu();
        }
    }
}
