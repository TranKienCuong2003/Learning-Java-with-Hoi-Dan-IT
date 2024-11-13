package Lesson9;

import java.util.Scanner;

public class Exercise4 {

    public static void GiaiPhuongTrinhBacNhat() {
        System.out.println(">>     LUA CHON TINH NANG 1     <<");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap bien a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap bien b: ");
        int b = scanner.nextInt();
        System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0 \n", a, b);

        if(a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            float x = (float) -b / a;
            System.out.printf("Phuong trinh co nghiem =  %.3f\n",  x);
        }
    }

    public static void GiaiPhuongTrinhBacHai() {
        System.out.println(">>     LUA CHON TINH NANG 2     <<");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap bien a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap bien b: ");
        int b = scanner.nextInt();

        System.out.print("Nhap bien c: ");
        int c = scanner.nextInt();

        System.out.printf("Giai phuong trinh bac hai %dx^2 + %dx + %d = 0 \n", a, b, c);

        if (a == 0) {
            GiaiPhuongTrinhBacNhat();
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
    }

    public static void TinhSoTienDien() {
        System.out.println(">>     LUA CHON TINH NANG 3     <<");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trinh tinh tien dien");

        System.out.print("Nhap vao so dien: ");
        int a = scanner.nextInt();
        int money;
        if (a <= 100) {
            money = a * 1000;
        } else {
            money = 100 * 1000 + (a - 100) * 1500;
        }
        System.out.println("So tien dien = " + money);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println(">>     LUA CHON TINH NANG     <<");
            System.out.println("++ -------------------------- ++");
            System.out.println("| 1. Giai phuong trinh bac nhat |");
            System.out.println("| 2. Giai phuong trinh bac hai  |");
            System.out.println("| 3. Tinh so tien dien         |");
            System.out.println("| 4. Ket thuc                  |");
            System.out.println("++ -------------------------- ++");

            System.out.print("Lua chon cua ban: ");
            int choosen = scanner.nextInt();

            switch (choosen) {
                case 1:
                    GiaiPhuongTrinhBacNhat();
                    break;
                case 2:
                    GiaiPhuongTrinhBacHai();
                    break;
                case 3:
                    TinhSoTienDien();
                    break;
                case 4:
                    System.out.println("Ban da thoat chuong trinh!");
                    running = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
                    break;
            }
        }

        scanner.close();
    }
}
