package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int k = 0; k < table[i].length; k++) {
                table[i][k] = (i + 1) * (k + 1);
            }
        }
        return table;
    }
}