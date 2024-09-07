import java.util.Scanner;
public class Array1{
    public static void main(String args[]) {
    
        double [] myList = new double[5];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 number : "+myList.length);
        
      for(int i = 0 ; i<myList.length ; i++){
          myList[i] = input.nextDouble();
      }
      System.out.println(myList[3]);
    }
}