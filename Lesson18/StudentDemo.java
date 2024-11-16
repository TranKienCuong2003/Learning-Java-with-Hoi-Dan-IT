package Lesson18;

public class StudentDemo {
    public static void main(String[] args) {
        System.out.println("Run code!");

        Student st1 = new Student();
        Student st2 = new Student("Tran Kien Cuong", 21);
        System.out.println("Check Object: " + st2.getName() + " and age = " + st2.getAge());
    }   
}
