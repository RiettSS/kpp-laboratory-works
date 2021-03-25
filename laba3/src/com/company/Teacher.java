package com.company;

public class Teacher extends Person{

    private int _yearsOfExperience;

    public Teacher(){
        super();
    }

    public Teacher(String name){
        super(name);
    }

    public Teacher(String name, int age){
        super(name, age);
    }

    public Teacher(String name, int age, int yearsOfExperience){
        super(name, age);
        _yearsOfExperience = yearsOfExperience;
    }

    public int GetExpYears(){
        return _yearsOfExperience;
    }

    public void SetExpYears(int yearsOfExperience){
        _yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void Speak() {
        System.out.println("I'm a teacher");
    }

    @Override
    public void Eat() {
        System.out.println("Teacher eats");
    }

    @Override
    public void Sleep() {
        System.out.println("Teacher is sleeping");
    }
}
