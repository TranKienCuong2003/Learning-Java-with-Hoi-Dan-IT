package Lesson5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten sinh vien: ");
        String tenSinhVien = scanner.nextLine();

        System.out.print("Nhap diem trung binh: ");
        double diemTrungBinh = scanner.nextDouble();

        System.out.println(tenSinhVien + " co diem = " + diemTrungBinh);
        scanner.close();
    }
}
