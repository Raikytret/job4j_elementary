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
}