package Lesson20;

import java.util.ArrayList;

public class StringListRemove {
    public static void main(String[] args) {
        int a = 10;
        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("Tran Kien Cuong");
        a1.add("TranKienCuong2003");
        a1.add("Developer");

        a1.remove(1);

        System.out.println(a1.toString() + " " + a1.get(1));
    }
}
