/*
ProjectFunctions.java
This class holds the main features for your project.
You can add as many custom methods as you want here.
Replace functions below with your own project features.
*/

import java.io.*;
import java.util.*;

public class ProjectFunctions {
    private final String DATA_FILE = "data/data.txt";

    // Example feature: Save user input to file
    public void featureOne() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type something to save: ");
        String input = sc.nextLine();

        try (FileWriter writer = new FileWriter(DATA_FILE, true)) {
            writer.write(input + "\n");
            System.out.println("✅ Saved successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    // Example feature: Display saved data
    public void featureTwo() {
        File file = new File(DATA_FILE);
        if (!file.exists()) {
            System.out.println("No data found yet.");
            return;
        }

        System.out.println("\n--- Saved Data ---");
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }
}
