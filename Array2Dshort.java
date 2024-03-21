//import java.util.Scanner;
public class Array2Dshort{
    public static void main(String args[]) {
    int[][] metrix = {
        {1,6,11,16},
        {2,7,12,17},
        {3,8,13,18},
        {4,9,14,19},
        {5,10,15,20},
    };
   
      for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[i].length; j++) {
                System.out.print(metrix[i][j] + " ");
            }
            System.out.println(); // Newline after each row
            }
    }
}