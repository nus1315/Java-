import java.util.Scanner;
public class play {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //in
            System.out.println("enter day : ");
            String day = in.nextLine();
            //Switch case
            switch (day) {
                case "Monday":
                    System.out.println("Weak up");
                    break;
                case "Tuesday":
                    System.out.println("Day2");
                    break;
                case "Wednesday":
                    System.out.println("Brokken");
                    break;
                default: 
                    System.out.println("Error");
                    break;
            }
        }
}