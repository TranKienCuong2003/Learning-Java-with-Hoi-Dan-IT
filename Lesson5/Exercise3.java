package Lesson5;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh cua hinh lap phuong: ");
        double side = scanner.nextDouble();

        System.out.println("The tich cua hinh lap phuong la: " + Math.pow(side, 3));

        scanner.close();
    }
}
