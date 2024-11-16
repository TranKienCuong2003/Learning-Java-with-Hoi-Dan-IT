package Lesson16;

public class StudentInfoTest {
    public static void main(String[] args) {
        Student st1 = new Student();

        Student st2 = new Student("Tran Kien Cuong", 21);
        System.out.println("Check object: " + st2.name + "and age = " + st2.age);
    }
}
