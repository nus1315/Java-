import java.util.Scanner;

public class SevenElevenCashier {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับข้อมูลประเภทสมาชิก
        System.out.print("เป็นสมาชิกหรือไม่ (Y/N): ");
        String isMemberStr = input.nextLine();
        boolean isMember = isMemberStr.equalsIgnoreCase("Y");

        // รับข้อมูลมูลค่าสินค้า
        System.out.print("ป้อนมูลค่าสินค้า: ");
        double price = input.nextDouble();

        // คำนวณส่วนลด
        double discountRate;
        if (isMember) {
            if (price <= 5000) {
                discountRate = 0.07;
            } else {
                discountRate = 0.10;
            }
        } else {
            if (price <= 3000) {
                discountRate = 0.03;
            } else {
                discountRate = 0.05;
            }
        }

        // คำนวณมูลค่าสินค้าหลังหักส่วนลด
        double discountedPrice = price * (1 - discountRate);

        // แสดงผลลัพธ์
        System.out.println("มูลค่าสินค้าก่อนหักส่วนลด: " + price + " บาท");
        System.out.println("ส่วนลด: " + (price - discountedPrice) + " บาท");
        System.out.println("มูลค่าสินค้าหลังหักส่วนลด: " + discountedPrice + " บาท");
    }
}



