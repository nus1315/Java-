import java.util.Scanner;

public class Divided {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                // input
        System.out.print("input n: ");
        int n = input.nextInt();
        
        //int g = 0 ;
        for (int i = 1; i<= n ;i++){
           if(n%i == 0) {
               System.out.println(i);
           }
        }
    }
}

    