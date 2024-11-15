package Lesson14;

public class StudentInfo {
    public static void main(String[] args) {
        System.out.println("Run video 23");

        Student st1 = new Student();
        st1.name = "Tran Kien Cuomg";
        st1.age = 21;

        System.out.println("Student with name: " + st1.name + " and age " +st1.age);

        Student st2 = new Student();
        st2.name = "KienCuong2003";
        st2.age = 21;

        System.out.println("Student with name: " + st2.name + " and age " +st1.age);

        Student st3 = new Student();
        st3.name = "KienCuong";
        st3.age = 21;

        System.out.println("Student with name: " + st3.name + " and age " +st1.age);
    }
}
