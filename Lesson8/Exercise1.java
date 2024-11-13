package Lesson8;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(">> LUA CHON TINH NANG <<");
        System.out.println("++ .................. ++");
        System.out.println("| 1. Cong              |");
        System.out.println("| 2. Tru               |");
        System.out.println("| 3. Ket thuc          |");
        System.out.println("++ .................. ++");

        System.out.print("Lua chon cua ban la: ");
        int value = scanner.nextInt();

        switch (value) {
            case 1:
                System.out.println("Ban da lua chon phep cong");
                break;
            case 2:
                System.out.println("Ban da lua chon phep tru");
                break;
            case 3:
                System.out.println("Ban da lua chon thoat chuong trinh!");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
                break;
        }
    }
}
