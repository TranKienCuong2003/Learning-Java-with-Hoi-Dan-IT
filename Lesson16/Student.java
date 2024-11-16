package Lesson16;

public class Student {

    public Student() {

    }

    public Student(String name1, int age1) {
        this.name = name1;
        this.age = age1;
    }

    //Class Attributes
    String name;
    int age;

    // Class method
    void learnJava() {
        System.out.println("Learn Java with Youtube Hoi Dan IT");
    }

    int getAge() {
        return 25;
    }
}
