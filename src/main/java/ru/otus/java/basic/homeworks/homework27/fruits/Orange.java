package ru.otus.java.basic.homeworks.homework27.fruits;

public class Orange extends Fruit {

    public Orange(int weight) {
        super(weight);
    }

    public String toString() {
        return "Orange, weight: " + getWeight();
    }

}

