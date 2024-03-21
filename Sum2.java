import java.util.Scanner;

public class Sum2{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("input n: ");
        int n = input.nextInt();
        System.out.print("input m: ");
        int m = input.nextInt();

        
        if (m <= n) {
            System.out.println("m > n");
            return;
        }

        int sum = 0;
        for (int i = n; i <= m; ++i) {
            sum += i;
        }

       
        System.out.println(sum);
    }
}
