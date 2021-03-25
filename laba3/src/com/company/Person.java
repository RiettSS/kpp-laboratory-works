package com.company;

public abstract class Person implements IPerson{
    private String _name;
    private int _age;

    private final String _defaultName = "name";
    private final int _defaultAge = 0;

    public Person(){
        _name = _defaultName;
        _age = _defaultAge;
    }

    public Person(String name){
        this();
        _name = name;
    }

    public Person(String name, int age){
        _name = name;
        _age = age;
    }

    public void SetName(String name) {
        _name = name;
    }

    public String GetName() {
        return _name;
    }

    public void SetAge(int age) {
        _age = age;
    }

    public int GetAge() {
        return _age;
    }
}
