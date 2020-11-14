package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second) {
            if (first > third) {
                return first;
            } else if (first <= third) {
                return third;
            }
        } else if (first <= second) {
            if (second > third) {
                return second;
            } else if (second <= third) {
                return third;
            }
        }
        return 0;
    }
}
