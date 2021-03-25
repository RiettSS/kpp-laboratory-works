package com.company;

public class HeadOfDepartment extends Person {

    @Override
    public void Speak() {
        System.out.println("I'm head of department");
    }

    @Override
    public void Eat() {
        System.out.println("Head of department eats");
    }

    @Override
    public void Sleep() {
        System.out.println("Head of department is sleeping");
    }
}
