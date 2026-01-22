package ru.otus.java.basic.homeworks.homework11;

public class Cat extends Animal {

    public Cat(String name, int runningSpeed,int stamina) {
        super(name, runningSpeed, 0,stamina,0);
    }

    public int swim(int distance){
        System.out.println("Коты не плавают.");
        return -1;
    }


}
