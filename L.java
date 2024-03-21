import java.util.Scanner; // Import the Scanner class for user input

public class L { // Define the class L

    public static void main(String[] args) { // Main method where program execution starts

        Scanner i = new Scanner(System.in); // Create a Scanner object for input

        // Input prompts and read user input
        System.out.print("in or out: ");
        String road = i.nextLine();
        System.out.print("Enter mile: ");
        double mile = i.nextDouble();
        

        double ticketPrice; // Declare variable to store ticket price

        switch (road) { // Switch statement based on road direction
            case "in": // If road is "in"
                System.out.println("IN");
                if (mile > 0 && mile < 150) { // Check mile range for "in"
                    ticketPrice = 1500;
                } else if (mile >= 150 && mile <= 200) { // Check another mile range for "in"
                    ticketPrice = 2500;
                } else { // If mile range is invalid for "in"
                    System.out.println("Invalid mile range for in direction.");
                    ticketPrice = 0; // Set ticket price to 0 for invalid cases
                }
                break;

            case "out": // If road is "out"
                System.out.println("OUT");
                if (mile > 200 && mile < 150) { // Check mile range for "out"
                    ticketPrice = 1500;
                } else if (mile >= 150 && mile <= 200) { // Check another mile range for "out"
                    ticketPrice = 2500;
                } else { // If mile range is invalid for "out"
                    System.out.println("Invalid mile range for out direction.");
                    ticketPrice = 0; // Set ticket price to 0 for invalid cases
                }
                break;

            default: // If road is neither "in" nor "out"
                System.out.println("Invalid road direction.");
                ticketPrice = 0; // Set ticket price to 0 for invalid cases
        }

        System.out.println("Ticket price: " + ticketPrice); // Print the ticket price
    }
}
