import java.util.Scanner;
public class Type1{
    public static void main(String[]args){
        Scanner d = new Scanner(System.in);
        
        System.out.print("Enter u name : ");
        String n = d.nextLine();
        System.out.print("Enter u personal type perple : ");
        String p = d.nextLine();
        
        switch ("personaltype"){
        case "INTJ":
            System.out.println("Strategic thinkers ");
            break;
        case "INTP":
            System.out.println("Creative");
            break;
        case "ENTJ":
            System.out.println("Decisive");
            break;
        case "ENTP":
            System.out.println("Quick-witted");
            break;
        default :
        System.out.println("error");
            break;
            
        }
    }
}