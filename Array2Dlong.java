//import java.util.Scanner;
public class Array2Dlong{
    public static void main(String args[]) {
    int[][] metrix = new int [5][4];
    metrix[0][0] = 1 ; metrix[0][1]=6 ; metrix[0][2]= 11; metrix[0][3]=16;
    metrix[1][0] = 2 ; metrix[1][1]=7 ; metrix[1][2]= 12; metrix[1][3]=17;
    metrix[2][0] = 3 ; metrix[2][1]=8 ; metrix[2][2]= 13; metrix[2][3]=18;
    metrix[3][0] = 4 ; metrix[3][1]=9 ; metrix[3][2]= 14; metrix[3][3]=19;
    metrix[4][0] = 5 ; metrix[4][1]=10 ; metrix[4][2]= 15; metrix[4][3]=20;
        
      for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[i].length; j++) {
                System.out.print(metrix[i][j] + " ");
            }
            System.out.println(); // Newline after each row
            }
    }
}