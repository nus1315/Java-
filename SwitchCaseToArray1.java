import java.util.Scanner;
public class SwitchCaseToArray1{

    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[][] dayNumbers = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}, {11, 12}, {13, 14}};

        // Get the day number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int dayNumber = scanner.nextInt();

        // Find the corresponding day of the week
        String dayOfWeek = "";
        for (int i = 0; i < dayNumbers.length; i++) {
            if (dayNumbers[i][0] <= dayNumber && dayNumber <= dayNumbers[i][1]) {
                dayOfWeek = daysOfWeek[i];
                break;
            }
        }

        // Print the day of the week
        System.out.println("The day of the week is: " + dayOfWeek);
    }
}
