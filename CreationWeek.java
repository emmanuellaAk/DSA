import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreationWeek {
    // Map to store the events and verses for each day
    private static final Map<Integer, String[]> creationEvents = new HashMap<>();
    private static final Map<Integer, String[]> creationVerses = new HashMap<>();

    static {
        // Initializing the events and verses for each day
        creationEvents.put(1, new String[]{"God created light", "God separated the light from the darkness"});
        creationVerses.put(1, new String[]{"Genesis 1:3", "Genesis 1:4"});

        creationEvents.put(2, new String[]{"God created the sky"});
        creationVerses.put(2, new String[]{"Genesis 1:6-8"});

        creationEvents.put(3, new String[]{"God created dry land and seas", "God created vegetation"});
        creationVerses.put(3, new String[]{"Genesis 1:9-10", "Genesis 1:11-12"});

        creationEvents.put(4, new String[]{"God created the sun, moon, and stars"});
        creationVerses.put(4, new String[]{"Genesis 1:14-19"});

        creationEvents.put(5, new String[]{"God created sea creatures and birds"});
        creationVerses.put(5, new String[]{"Genesis 1:20-23"});

        creationEvents.put(6, new String[]{"God created animals", "God created mankind"});
        creationVerses.put(6, new String[]{"Genesis 1:24-25", "Genesis 1:26-27"});

        creationEvents.put(7, new String[]{"God rested", "God blessed the seventh day and made it holy"});
        creationVerses.put(7, new String[]{"Genesis 2:1-3"});
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a day of the creation week (1-7) or 0 to exit:");
            int day = scanner.nextInt();

            if (day == 0) {
                break;
            }

            if (day < 1 || day > 7) {
                System.out.println("Invalid day. Please enter a number between 1 and 7.");
                continue;
            }

            displayEvents(day, scanner);
        }

        scanner.close();
    }

    private static void displayEvents(int day, Scanner scanner) {
        String[] events = creationEvents.get(day);
        String[] verses = creationVerses.get(day);
       //These lines retrieve the events and corresponding verses for the specified day from the creationEvents and creationVerses collections.

        System.out.println("Events on day " + day + ":");
        // starts with a message indicating the day
        //prints out all the events for the given day
        for (int i = 0; i < events.length; i++) {
            System.out.println((i + 1) + ". " + events[i]);
        }
        //loops through the events array, printing each event with its index

        System.out.println("Enter the number of the event to see the corresponding verse, or 0 to go back:");
        int eventChoice = scanner.nextInt();

        if (eventChoice > 0 && eventChoice <= events.length) {
            System.out.println("Verse: " + verses[eventChoice - 1]);
        } else if (eventChoice != 0) {
            System.out.println("Invalid input. Returning to the main menu.");
        }
        //If the user enters a valid number,it prints the corresponding verse.
        //If the user enters an invalid number,it prints an error message and returns to the beginning
    }
}
