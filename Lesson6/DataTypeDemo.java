package Lesson6;

import java.util.Scanner;

public class DataTypeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a = 100;
        short b = 1000;
        long c = 50000L;

        System.out.println("Gia tri byte: " + a);
        System.out.println("Gia tri short: " + b);
        System.out.println("Gia tri long: " + c);

        scanner.close();
    }
}
