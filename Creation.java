import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Creation {
    public static void main(String[] args) {
        // List of creation events
        List<String> story = new ArrayList<>();
        story.add("Day 1: God created light and separated the light from the darkness.");
        story.add("Day 2: God created the sky and separated the waters above from the waters below.");
        story.add("Day 3: God gathered the waters to one place, dry ground appeared, and God created vegetation.");
        story.add("Day 4: God created the sun, moon, and stars to give light to the earth and to govern the day and night.");
        story.add("Day 5: God created the fish and the birds.");
        story.add("Day 6: God created the animals on land and created mankind in His own image.");
        story.add("Day 7: God rested from all His work and blessed the seventh day and made it holy.");

        // List of corresponding Bible verses
        List<String> verses = new ArrayList<>();
        verses.add("Genesis 1:3-5");
        verses.add("Genesis 1:6-8");
        verses.add("Genesis 1:9-13");
        verses.add("Genesis 1:14-19");
        verses.add("Genesis 1:20-23");
        verses.add("Genesis 1:24-31");
        verses.add("Genesis 2:1-3");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter the day of the creation week (1-7) to view the event or 0 to exit:");
                int day = scanner.nextInt(); 
                //nextInt scans the next input as an integer
                if (day == 0) {
                    break;
                } 
                 // Exit the application if the user enters 0

                if (day < 1 || day > 7) { 
                    System.out.println("Invalid input. Please enter a number between 1 and 7.");
                    continue; 
                } 
                // validate user input

                
                System.out.println(story.get(day - 1));
                // Display the event
                
                // Ask if the user wants to see the corresponding verse
                System.out.println(" Bible verse? (yes or no)");
                String response = scanner.next();

                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("Corresponding Bible verse: " + verses.get(day - 1));
                }
            }
        }
    }
}
