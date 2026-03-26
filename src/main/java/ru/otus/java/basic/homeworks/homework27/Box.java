package ru.otus.java.basic.homeworks.homework27;

import ru.otus.java.basic.homeworks.homework27.fruits.Fruit;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits =  new ArrayList<T>();

    public void addFruit(T t){
        fruits.add(t);
    }

    public int getBoxWeight() {
        int boxWeight = 0;
        for (Fruit t : fruits) {
            boxWeight += t.getWeight();
        }
        return boxWeight;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return getBoxWeight() == box.getBoxWeight();
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void shiftFruits(Box<? extends T> box) {
        ArrayList<? extends T> fruitFromOtherBox = box.getFruits();
        for (T t : fruitFromOtherBox) {
            addFruit(t);
        }
        fruitFromOtherBox.clear();
    }

    public void info(){
        for  (T fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
