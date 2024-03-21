import java.util.Scanner;
public class G3{
    public static void main(String[]args){
        Scanner w = new Scanner(System.in);
        //input
        System.out.print("Enter P:  ");
        int P = w.nextInt();
        System.out.print("Enter i:  ");
        double I = w.nextDouble();
        System.out.print("Enter n:  ");
        int N = w.nextInt();
        
        //Sol
        double i = (I/100)/12;
        int n = N*12;
        double a = Math.pow((1+i),n);
        double M = P*((a*i)/(a-1));
        
        System.out.print("M is "+ Math.round(M)+ " When P "+P);
        
    }
}