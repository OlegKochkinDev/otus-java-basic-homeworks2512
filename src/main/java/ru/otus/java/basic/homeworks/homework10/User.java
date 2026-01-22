package ru.otus.java.basic.homeworks.homework10;

public class User {
    private String firstName;
    private String lastName;
    private String surName;
    private int birthYear;
    private String email;


    public User(String lastName, String firstName, String surName, int birthYear, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.birthYear = birthYear;
        this.email = email;
    }

    public void getInfo(){
        System.out.println("ФИО: " + lastName + " " + firstName + " " + surName);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + email);
        System.out.println();
    }

    public int getBirthYear(){
        return birthYear;
    }

}
