package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < (int) array.length / 2; index++) {
            array = SwitchArray.swap(array, index, array.length - index - 1);
        }
        return array;
    }
}