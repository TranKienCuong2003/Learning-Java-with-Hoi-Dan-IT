package Lesson7;

public class TaxCalculator {
    public static void main(String[] args) {
        // Duoi 10tr: Khong phai dong thue
        // Tu 10tr - 15tr: Nop thue 10%
        // Tu 15tr - 30 tr: Nop thue 20%
        // Tren 30tr: Nop thue 50%

        int tax = 0;

        if(tax < 10) {
            System.out.println("Khong phai dong thue");
        }else if(10 <= tax && tax <= 15) {
            System.out.println("Nop thue 10%");
        }else if(15 <= tax && tax <= 30) {
            System.out.println("Nop thue 20%");
        }else {
            System.out.println("Nop thue 50%");
        }
    }
}
