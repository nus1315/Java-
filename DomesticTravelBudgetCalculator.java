import java.util.Scanner;

public class DomesticTravelBudgetCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // แสดงเมนู
        System.out.println("1) เดินทางภาคใต้ (Southern)");
        System.out.println("2) เดินทางไปเที่ยวภาคเหนือ (Northern)");
        System.out.print("เลือกประเภทการเดินทาง: ");
        int travelType = input.nextInt();

        // รับระยะทาง
        System.out.print("ป้อนระยะทาง (กิโลเมตร): ");
        int distance = input.nextInt();

        // คำนวณค่าตั๋วเครื่องบิน
        double ticketPrice = 0;
        if (travelType == 1) {
            if (distance <= 150) {
                ticketPrice = 150;
            } else if (distance <= 200) {
                ticketPrice = 250;
            } else {
                System.out.println("ระยะทางเกินกำหนด");
                return;
            }
        } else if (travelType == 2) {
            if (distance <= 250) {
                ticketPrice = 350;
            } else if (distance <= 300) {
                ticketPrice = 450;
            } else {
                System.out.println("ระยะทางเกินกำหนด");
                return;
            }
        } else {
            System.out.println("ประเภทการเดินทางไม่ถูกต้อง");
            return;
        }

        double totalBudget = ticketPrice ;

        // แสดงผลลัพธ์
        System.out.println("ค่าตั๋วเครื่องบิน: " + ticketPrice + " บาท");
        System.out.println("งบประมาณทั้งหมด: " + totalBudget + " บาท");
    }
}

