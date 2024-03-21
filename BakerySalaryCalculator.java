import java.util.Scanner;

public class BakerySalaryCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("(PT / MT): ");
        String employeeType = input.nextLine();

        System.out.print("Hr : ");
        int hoursWorked = input.nextInt();

        double overtimePay, totalSalary;
        if (employeeType.equalsIgnoreCase("pt")) {
            if (hoursWorked <= 49) {
                overtimePay = 0;
            } else if (hoursWorked <= 59) {
                overtimePay = 500;
            } else {
                overtimePay = 1000;
            }
        } else if (employeeType.equalsIgnoreCase("mt")) {
            if (hoursWorked <= 79) {
                overtimePay = 1500;
            } else if (hoursWorked <= 89) {
                overtimePay = 2000;
            } else {
                overtimePay = 2500;
            }
        } else {
            System.out.println("Erorr");
            return;
        }

        totalSalary = overtimePay + (hoursWorked * 300);

        System.out.println(" OT: " + overtimePay + " Bath");
        System.out.println("Salary : " + totalSalary + " Bath");
    }
}
