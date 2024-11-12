package Lesson5;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double length = scanner.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double width = scanner.nextDouble();

        System.out.println("Chu vi cua hinh chu nhat la: " + ((length + width) * 2));
        System.out.println("Dien tich hinh chu nhat la: " + (length * width));
        System.out.println("Canh nho nhat cua hinh chu nhat la: " + Math.min(length, width));

        scanner.close();
    }
}
