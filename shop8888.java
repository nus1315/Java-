import java.util.Scanner;

public class shop8888 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Member (NM / M): ");
        String memberType = input.nextLine();

        System.out.print("prices : ");
        int price = input.nextInt();

        double discountRate;
        if (memberType.equalsIgnoreCase("NM")) {
            if (price <= 30000) {
                discountRate = 0.03;
            } else {
                discountRate = 0.05;
            }
        } else if (memberType.equalsIgnoreCase("M")) {
            if (price <= 50000) {
                discountRate = 0.07;
            } else {
                discountRate = 0.1;
            }
        } else {
            System.out.println("non data");
            return;
        }

        double discount = price * discountRate;

        //output
        System.out.println("Save : " + discount + " บาท");
        System.out.println("Price : " + (price - discount) + " Bath");
    }
}

