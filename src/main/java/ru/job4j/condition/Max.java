package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean number = left > right;
        int result = number ? left : right;
        return result;
    }
}