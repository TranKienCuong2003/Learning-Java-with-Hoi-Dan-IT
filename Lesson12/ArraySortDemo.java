package Lesson12;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] number = {5, 1, 15, 66, 23};
        System.out.println(number);

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }
}
