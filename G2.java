import java.util.Scanner;
public class G2 {
    public static void main(String args[]) {

    // Input 
    Scanner input = new Scanner (System.in);
    System.out.print("โปรดใส่ค่า P: ");
    
    int P = input.nextInt();
    if (P < 0) {
        System.out.println("ค่า P ต้องมากกว่าหรือเท่ากับ 0");
        return;
    }   
    System.out.print("โปรดใส่ค่า r: ");
    double r = input.nextDouble();
    if (r < 0 || r > 100) {
        System.out.println("ค่า r ต้องอยู่ระหว่าง 0 ถึง 100");
        return;
        
    }
    System.out.print("โปรดใส่ค่า t: "); 
    int t = input.nextInt();
    if (t < 0) {
        System.out.println("ค่า t ต้องมากกว่าหรือเท่ากับ 0");
        return;
        
    }
    // Process แทนค่าในสมการเพื่อหา A
    double A = P * Math.pow(1 + r/100 , t);
    // Output
    System.out.println("ค่า A เมื่อกำหนด t = "+t+" คือ: "+A);
        
    }
}
