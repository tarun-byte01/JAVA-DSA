import java.util.*;

class Main {

    static boolean isSafe(char[][] board, int row, int col, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    static boolean solve(char[][] board, int row, int n) {

        if (row == n)
            return true;

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                // Choose
                board[row][col] = 'Q';

                // Explore
                if (solve(board, row + 1, n))
                    return true;

                // Undo
                board[row][col] = '.';
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 4;

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        solve(board, 0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

Output
  
. Q . .
. . . Q
Q . . .
. . Q .

  
Important part ⭐
  
board[row][col] = 'Q';

if (solve(board, row + 1, n))
    return true;

board[row][col] = '.';

The last line is the UNDO step.
