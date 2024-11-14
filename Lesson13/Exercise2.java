package Lesson13;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen bat ki: ");

        int x = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d ", x, i, x *i );
            System.out.printf("\n");
        }
        scanner.close();
    }
}
