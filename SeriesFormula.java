import java.util.Scanner;

public class SeriesFormula{

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
        int g = m-(n-1);
        int j = m+n;
        int s = g*(j/2);
       
        System.out.println(s);
    }
}

    