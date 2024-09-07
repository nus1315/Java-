import java.util.Scanner;

public class T {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input prompts and reading
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your score: ");
        double score = input.nextDouble();

        // Calculate grade using a switch statement
        char grade;
        switch ((int) score / 10) { // Convert score to integer for switch case
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            default:
                grade = 'F';
        }

        // Output result
        System.out.println(name + ", your grade is: " + grade);

        if (grade != 'F') {
            System.out.println("Congratulations, you passed!");
        } else {
            System.out.println("Keep studying and try again next time.");
        }
    }
}
