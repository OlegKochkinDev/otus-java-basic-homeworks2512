package ru.otus.java.basic.homeworks.hw16;

public class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }
}
