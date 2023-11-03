package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            while (j < array.length)  {
                if  (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
                    j++;
            }
        }
        return new int[]{};
    }
}