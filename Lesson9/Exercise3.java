package Lesson9;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trinh tinh tien dien");

        System.out.print("Nhap vao so dien: ");
        int a = scanner.nextInt();
        if (a <= 100) {
            int money = a * 1000;
            System.out.println("So tien dien = " + money);
        }else {
            int money = 100 * 1000 + (a - 100) * 1500;
            System.out.println("So tien dien = " + money);
        }
        scanner.close();
    }   
}
