import java.util.Scanner;

public class CarExpenseCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("distances : ");
        int distance = input.nextInt();

        double transportFee, fuelFee;
        if (distance <= 20) {
            transportFee = distance * 20;
            fuelFee = distance * 10;
        } else if (distance <= 30) {
            transportFee = distance * 25;
            fuelFee = distance * 20;
        } else {
            System.out.println("limit distance");
            return;
        }

        double totalExpense = transportFee + fuelFee;

        System.out.println("Price : " + transportFee + " Bath");
        System.out.println("Oil Price: " + fuelFee + " Bath");
        System.out.println("Final Prices: " + totalExpense + " Bath");
    }
}


