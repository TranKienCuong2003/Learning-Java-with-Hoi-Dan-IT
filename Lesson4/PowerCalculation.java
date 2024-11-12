package Lesson4;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: " + Math.pow(2, 3));
        int firstNumber = scanner.nextInt();

        System.out.println("Second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Min = " + Math.min(firstNumber, secondNumber));
        scanner.close();
    }
}
