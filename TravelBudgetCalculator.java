import java.util.Scanner;

public class TravelBudgetCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Local / International: ");
        String travelType = input.nextLine();

        System.out.print("Mile: ");
        double distance = input.nextInt();

        double ticketPrice = 0;

        // Use a switch statement for cleaner travelType handling
        switch (travelType.toLowerCase()) {
            case "local":
                if (distance <= 150) {
                    ticketPrice = 1500;
                } else if (distance <= 200) {
                    ticketPrice = 2500;
                }
                break;
            case "international":
                if (distance <= 250) {
                    ticketPrice = 3500;
                } else if (distance <= 300) {
                    ticketPrice = 4500;
                }
                break;
           
        }
        double totalBudget = ticketPrice ;

        System.out.println("Ticket Price: " + ticketPrice + " Bath");
        System.out.println("Total Budget: " + totalBudget + " Bath");
    }
}

