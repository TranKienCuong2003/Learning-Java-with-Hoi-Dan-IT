package Lesson12;

import java.util.Arrays;

public class BubbleSor {
    public static void main(String[] args) {
        int[] number = {5, 1, 15, 66, 23};

        for (int i = 0; i < number.length -1; i++) {
            for(int j = i + 1; j < number.length; j++) {
                if(number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }   
}
