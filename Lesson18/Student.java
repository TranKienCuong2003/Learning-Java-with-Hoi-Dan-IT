package Lesson18;

public class Student {

    //Class Attributes
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return "Tran Kien Cuong voi " + this.name;
    }

    public int getAge() {
        return this.age;
    }
}
