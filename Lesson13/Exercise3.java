package Lesson13;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui long nhap so luong phan tu cua mang: ");
        int size = scanner.nextInt();
        int a[] = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.printf("Nhap phan tu thu %d cua mang: ", i + 1);
            a[i] = scanner.nextInt();
        }
        System.out.println("Mang ban dau: " + Arrays.toString(a));

        // Arrays.sort(a);
        // System.out.println("Mang sau khi duoc sap xep: " + Arrays.toString(a));

        // System.out.println("Phan tu lon nhat trong mang la: " + a[a.length - 1]);
        // System.out.println("Phan tu nho nhat trong mang la: " + a[0]);

        int max = a[0];
        for(int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }

        int min = a[0];
        for(int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println("Phan tu lon nhat trong mang la: " + max);
        System.out.println("Phan tu nho nhat trong mang la: " + min);

        scanner.close();
    }
}
