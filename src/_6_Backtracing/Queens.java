package _6_Backtracing;

import java.util.ArrayList;
import java.util.List;

public class Queens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        bracktrack(result, initBoard(n), 0);
        return result;
    }

    private void bracktrack(List<List<String>> result, char[][] board,int col) {
        if(col == board.length) {
            result.add(construct(board));
            return;
        }

        for(int row = 0; row < board.length; row++) {
            if(validate(board, row, col)) {
                board[row][col] = 'Q';
                bracktrack(result, board,col+1);
                board[row][col] = '.';
            }
        }
    }

    private boolean validate(char[][] board,int row, int col) {
        int irow = row;
        int icol = col;

        // upper diagonal
        while(row >= 0 && col >= 0) {
            if(board[row][col] == 'Q') return false;
            row--; col--;
        }

        //lower diagonal
        row = irow;
        col = icol;
        while(row < board.length && col >= 0) {
            if(board[row][col] == 'Q') return false;
            row++; col--;
        }

        // left
        row = irow;
        col = icol;
        while(col >= 0) {
            if(board[row][col] == 'Q') return false;
            col--;
        }
        return true;
    }

    private char[][] initBoard(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        return board;
    }

    private List<String> construct(char[][] board) {
        List<String> row = new ArrayList<>();
        for(char i = 0 ; i< board.length; i++) {
            String  s = "";
            for(char j = 0 ; j < board.length; j++) {
                s += board[i][j];
            }
            row.add(s);
        }
        return row;
    }
}
