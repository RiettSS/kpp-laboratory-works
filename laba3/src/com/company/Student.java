package com.company;

public class Student extends Person{

    private int _course;

    public Student(){
        super();
    }

    public Student(String name){
        super(name);
    }

    public Student(String name, int age){
        super(name, age);
    }

    public Student(String name, int age, int course){
        super(name, age);
        _course = course;
    }

    public int GetCourse(){
        return _course;
    }

    public void SetCourse(int course){
        _course = course;
    }

    @Override
    public void Speak() {
        System.out.println("I'm a student");
    }

    @Override
    public void Eat() {
        System.out.println("Student eats");
    }

    @Override
    public void Sleep() {
        System.out.println("Student is sleeping");
    }
}
