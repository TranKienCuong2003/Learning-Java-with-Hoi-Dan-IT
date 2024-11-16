package Lesson17.Exemple2;

import Lesson17.AccessModifierExample;

public class P3 extends AccessModifierExample {

    private void test () {
        AccessModifierExample firstObject = new AccessModifierExample();
        firstObject.a = 10;
        // firstObject.b = 10;
        super.c = 10; //protected
        // firstObject.d = 10;
    }
    public static void main(String[] args) {

    }
}
