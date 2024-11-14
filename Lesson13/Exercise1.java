package Lesson13;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen bat ky: ");

        int  PrimeNumber = scanner.nextInt();

        int count = 0;
        for ( int i = 2; i <= PrimeNumber - 1; i++) {
            if(PrimeNumber % i == 0) {
                System.out.println("Uoc so khac: " + i);
                count ++;
            }
        }
        if(count == 0) {
            System.out.printf("%d La so nguyen to", PrimeNumber);
        }else {
            System.out.printf("%d Khong phai la so nguyen to!", PrimeNumber);
        }
        scanner.close();
    }
}
