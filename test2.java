import java.util.Scanner;
public class test2 {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please input n for Oompa Loompa : ");
    int n = input.nextInt();
    
    //condition
   if (n>=1 && n<=100) {
        if (n%3==0 && n%5==0)
            System.out.print("Oompa Loompa");
        else if (n%3==0) {
            System.out.print("Oompa");
        }
        else if (n%5==0) 
            System.out.print("Loompa");
        
        else {
            System.out.print(n);
        }
   }
    else {
    System.out.print("Please input n in rage of 1 to 100");
    }
    }
}
