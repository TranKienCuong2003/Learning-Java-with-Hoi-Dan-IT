package Lesson15;

public class SumCaculator {
    int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        SumCaculator test = new SumCaculator();

        int a = test.sum(6, 9);
        System.out.println("Check sum: " + a);
    }
}
