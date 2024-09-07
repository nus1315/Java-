import java.util.Scanner;

public class S88 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input membership type and price
        System.out.print("Enter your membership type (NM/M): ");
        String membershipType = scanner.nextLine().toUpperCase(); // Handle case-insensitivity

        System.out.print("Enter the product price: ");
        double price = scanner.nextDouble();

        // Validate membership type
        if (!membershipType.equals("NM") && !membershipType.equals("M")) {
            System.out.println("Invalid membership type. Please enter 'NM' or 'M'.");
            return; // No need to calculate discount for invalid input
        }

        // Calculate discount rate based on membership and price
        double discountRate = 0;
        switch (membershipType) {
            case "NM":
                if (price <= 30000) {
                    discountRate = 0.03;
                } else {
                    discountRate = 0.05;
                }
                break;
            case "M":
                if (price <= 50000) {
                    discountRate = 0.07;
                } else {
                    discountRate = 0.1;
                }
                break;
        }

        // Calculate discount and final price
        final double discount = price * discountRate;
        // Output formatted results
       
        System.out.println("Save : " + discount + " บาท");
        System.out.println("Price : " + (price - discount) + " Bath");
    }
}

               
        
    

