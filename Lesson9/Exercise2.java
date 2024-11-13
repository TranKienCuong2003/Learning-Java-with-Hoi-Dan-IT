package Lesson9;

import java.util.Scanner;

public class Exercise2 {
    public static void GiaiPhuongTrinhBacNhat(int a, int b) {
        System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0 \n", a, b);
        if(a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            float x = (float) -b / a;
            System.out.printf("Phuong trinh co nghiem x = %.3f\n", x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap bien a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap bien b: ");
        int b = scanner.nextInt();

        System.out.print("Nhap bien c: ");
        int c = scanner.nextInt();

        System.out.printf("Giai phuong trinh bac hai %dx^2 + %dx + %d = 0 \n", a, b, c);

        if (a == 0) {
            GiaiPhuongTrinhBacNhat(b, c);
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                float x = (float) -b / (2 * a);
                System.out.printf("Phuong trinh co nghiem kep x = %.3f\n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phuong trinh co hai nghiem phan biet: x1 = %.3f va x2 = %.3f\n", x1, x2);
            }
        }
        scanner.close();
    }
}
