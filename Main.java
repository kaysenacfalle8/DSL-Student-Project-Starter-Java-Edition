/*
-------------------------------------------
Project Title: ______________________
Student Name:  ______________________
Date:          ______________________
Description:
    Briefly describe what your project does.
-------------------------------------------
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProjectFunctions pf = new ProjectFunctions();

        System.out.println("Welcome to [Your Project Name Here]!");

        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    pf.featureOne();
                    break;
                case "2":
                    pf.featureTwo();
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
