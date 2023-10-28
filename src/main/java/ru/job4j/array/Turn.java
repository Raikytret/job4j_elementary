package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length - 1; i++) {
                int temp = array[0];
                array[0] = array[array.length - 1];
                array[array.length - 1] = temp;
                for (int k = 0; k < array.length - 1; k++) {
                    int temp1 = array[0 + 1];
                    array[0 + 1] = array[array.length - 1 - 1];
                    array[array.length - 1 - 1] = temp1;
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                int temp = array[0];
                array[0] = array[array.length - 1];
                array[array.length - 1] = temp;
                for (int k = 0; k < array.length; k++) {
                    int temp1 = array[0 + 1];
                    array[0 + 1] = array[array.length - 1 - 1];
                    array[array.length - 1 - 1] = temp1;
                }
            }
        }
        return array;
    }
}