import java.util.Scanner;

public class Wage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input
        System.out.print("hour lyrate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("hour worked: ");
        int hoursWorked = input.nextInt();

        double normalPay = hourlyRate * Math.min(hoursWorked, 40);
        double overtimePay = 0;
        if (hoursWorked > 40) {
            overtimePay = (hourlyRate * 1.5) * (hoursWorked - 40);
        }
        double totalPay = normalPay + overtimePay;
        System.out.println(totalPay);
    }
}

