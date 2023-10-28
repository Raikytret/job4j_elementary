package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && notPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int k = 5;
        boolean rsl = LogicNot.isEven(k);
        System.out.println(rsl);

        rsl = LogicNot.isPositive(k);
        System.out.println(rsl);

        rsl = LogicNot.notEven(k);
        System.out.println(rsl);

        rsl = LogicNot.notPositive(k);
        System.out.println(rsl);

        rsl = LogicNot.notEvenAndPositive(k);
        System.out.println(rsl);

        rsl = LogicNot.evenOrNotPositive(k);
        System.out.println(rsl);
    }
}