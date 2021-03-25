package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var list = new ArrayList<Person>();

        var student = new Student();
        var teacher = new Teacher();
        var headOfDepartment = new HeadOfDepartment();

        list.add(student);
        list.add(teacher);
        list.add(headOfDepartment);

        for (Person person : list) {
            if(person instanceof Person)
            person.Speak();
        }
    }
}
