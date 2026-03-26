package ru.otus.java.basic.homeworks.homework27.fruits;

public class Apple extends Fruit {

    private final int order = 2;

    public Apple(int weight) {
        super(weight);
    }

    public String toString() {
        return "Apple, weight: " + getWeight();
    }
}
