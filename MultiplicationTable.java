import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String args[]) {
    Scanner n = new Scanner(System.in);
    //input
    System.out.print("input p : ");
    int p = n.nextInt();
    if (p == 17){
        for (int o = 1; o<= 12;o++){   
        System.out.println("17*"+o +"= "+o*17 );
        } 
    }
    else System.out.print("error");
}
    
}
