package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean number1 = left > right;
        int result = number1 ? left : right;
        return result;
    }
}