import java.util.Scanner;
public class reviewfortest2{
    public static void main(String[]args){
       //input
        Scanner n = new Scanner(System.in);
        System.out.print("Enter day : ");
        String day = n.nextLine();
        System.out.print("Enter date : ");
        int date = n.nextInt();
        //if-else
        if  (15 >=date ){
            System.out.print("first" + date);
        }
        else {System.out.print("second" + date);}
        //swichcase
        switch (day){
            case "Monday":
                System.out.println("Mon");
                break;
            case "Tuesday":
                System.out.println("Tue");
                break;
            case "Wednesday":
                System.out.println("Wed");
                break;
            case "Thursday":
                System.out.println("Thu");
                break;
            case "Friday":
                System.out.println("Fri");
                break;
            case "Saturday":
                System.out.println("Sat");
                break;
            case "Sunday":
                System.out.println("Sun");
                break;
            default:System.out.println("none");
        }
        
    }
}