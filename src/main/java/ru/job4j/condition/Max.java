package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int one = first > second ? first : second;
        int result = one > third ? one : third;
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int one = (first > second) ? first : second;
        int two = one > third ? one : third;
        int result = two > fourth ? two : fourth;
        return result;
    }
}