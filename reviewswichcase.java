import java.util.Scanner;
public class reviewswichcase{
    public static void main(String[]args){
       //input
        Scanner n = new Scanner(System.in);
        System.out.print("Enter day : ");
        String day = n.nextLine();
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