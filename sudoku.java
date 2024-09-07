import java.util.Random;
import java.util.Scanner;

public class sudoku {

    // Constants
    private static final int GRID_SIZE = 9;
    private static final int BLOCK_SIZE = 3;

    // Game board
    private int[][] board;

    public void Sudoku() {
        board = new int[GRID_SIZE][GRID_SIZE];
    }

    // Generate a new Sudoku puzzle
    public void generatePuzzle() {
        Random random = new Random();

        // Fill initial cells randomly
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (random.nextInt(3) == 0) { // 1/3 chance to fill
                    int num = random.nextInt(GRID_SIZE) + 1;
                    if (isValidMove(row, col, num)) {
                        board[row][col] = num;
                    }
                }
            }
        }

        // Backtrack to create a solvable puzzle
        solveBacktrack();

        // Remove additional cells to increase difficulty
        int cellsToRemove = GRID_SIZE * GRID_SIZE - (GRID_SIZE / 2) + 1; // More cells for harder difficulty
        while (cellsToRemove > 0) {
            int row = random.nextInt(GRID_SIZE);
            int col = random.nextInt(GRID_SIZE);
            if (board[row][col] != 0 && canRemoveCell(row, col)) {
                board[row][col] = 0;
                cellsToRemove--;
            }
        }
    }

    // Solve the Sudoku puzzle using backtracking
    private boolean solveBacktrack() {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= GRID_SIZE; num++) {
                        if (isValidMove(row, col, num)) {
                            board[row][col] = num;
                            if (solveBacktrack()) {
                                return true;
                            } else {
                                board[row][col] = 0; // Backtrack
                            }
                        }
                    }
                    return false; // No valid move found
                }
            }
        }
        return true; // Solved
    }

    // Check if a move is valid
    private boolean isValidMove(int row, int col, int num) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        int blockRow = row / BLOCK_SIZE;
        int blockCol = col / BLOCK_SIZE;
        for (int i = blockRow * BLOCK_SIZE; i < blockRow * BLOCK_SIZE + BLOCK_SIZE; i++) {
            for (int j = blockCol * BLOCK_SIZE; j < blockCol * BLOCK_SIZE + BLOCK_SIZE; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Check if a cell can be removed without making the puzzle unsolvable
    private boolean canRemoveCell(int row, int col) {
        int[][] tempBoard = copyBoard(); // Create a copy to avoid modifying original
        tempBoard[row][col] = 0;
        return solveBacktrack(); // Try to solve with the cell removed
    }

    // Copy the Sudoku board
    private int[][] copyBoard() {
        int[][] copy = new int[GRID_SIZE][GRID_SIZE];
        for (int i = 0; i < GRID_SIZE; i++) {
            System.arraycopy(board[i], 0, copy[i], 0, GRID_SIZE);
        }
        return copy;
    }

    // Print the Sudoku board
    /**
     * 
     */
    public void printBoard() {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {

            }
        }
    }
                



    public static int getGridSize() {
        return GRID_SIZE;
    }

    public static int getBlockSize() {
        return BLOCK_SIZE;
    }

    public int[][] getBoard() {
        return board;
    }

    /**
     * @param board
     */
    public void setBoard(int[][] board) {
        this.board = board;
    }
}
