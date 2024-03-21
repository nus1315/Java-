import java.util.Scanner;

public class Array2Dinput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][4];
        System.out.println("Enter"+matrix.length+"row and"+ matrix[0]
        .length+"columns : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
            System.out.println(); 
        }
    
        
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            
        }
    }
    
}


