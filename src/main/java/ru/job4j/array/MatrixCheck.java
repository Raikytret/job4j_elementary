package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char r =  'X';
        for (int i = row; i <= row; i++) {
            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] != r) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char r =  'X';
        for (int i = 0; i < board.length; i++) {
            for (int k = column; k <= column; k++) {
                if (board[i][k] != r) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}