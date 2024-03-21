import java.util.Scanner;
public class final1 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        //in
        System.out.print("enter integer : ");
        int n = in.nextInt();
        int count = 0;
        int count2= 0;
        //so
        if (n<=0){
            System.out.print("plz enter integer ");
        }
        else{
            for (int i = 1 ; i<= n ; i++){
                if (i%5 == 0 ){
                    System.out.println(i + " divisible by 5");
                    count += 1;
                }
                else {
                    System.out.println(i+ " other number");
                    count2 += 1;
                }
            }
            System.out.println("Count of divisible by 5 is " + count);
            System.out.println("Count of other numbers : "+count2);
            
        }

    }
}
