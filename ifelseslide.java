//import java.util.Scanner;
public class ifelseslide{
    public static void main(String[]args){
        //Scanner in = new Scanner(System.in);
        int i, j;
        boolean b1, b2;
        
        i = 10;
        j = 11;
        
        if (i<j)    System.out.println("i<j");
        if (i<=j)   System.out.println("i<=j");
        if (i!=j)   System.out.println("i!=j");
        if (i==j)   System.out.println("this won't execute");
        if (i>=j)   System.out.println("this won't execute");
        if (i>j)    System.out.println("this won't execute");
        
        b1 = true ;
        b2 = false;
        
        if (b1&b2)  System.out.println("this won't execute");
        if (!(b1&b2))System.out.println("true");
        if (b1|b2)  System.out.println("is true");
        if (b1^b2)  System.out.println("T");
    }
}