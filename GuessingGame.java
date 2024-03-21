import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // ตั้งค่าตัวแปร
        int randomNumber = random.nextInt(100) + 1;
        int guessCount = 0;

        // เริ่มเกม
        while (true) {
            guessCount++;

            // ทายเลข
            System.out.print("ทายเลข (1-100): ");
            int guess = input.nextInt();

            // ตรวจสอบ
            if (guess == randomNumber) {
                System.out.println("ทายถูก! ใช้จำนวนครั้ง " + guessCount);
                break;
            } else if ((randomNumber - 5 < guess) && (guess < randomNumber)){
                System.out.println("เลขที่ทายน้อยเกินไป แต่ก็เกือบล่ะ");
            } else if ((randomNumber < guess) && (guess < randomNumber + 5)){
                System.out.println("เลขที่ทายมากเกินไป แต่ก็เกือบล่ะ");
            }
            else if (guess < randomNumber) {
                System.out.println("เลขที่ทายน้อยเกินไป");
            } else {
                System.out.println("เลขที่ทายมากเกินไป");
            }
        }
    }
}
