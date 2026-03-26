package ru.otus.java.basic.homeworks.homework27;

import ru.otus.java.basic.homeworks.homework27.fruits.Apple;
import ru.otus.java.basic.homeworks.homework27.fruits.Fruit;
import ru.otus.java.basic.homeworks.homework27.fruits.Orange;

public class AppHw27 {

    public static void main(String[] args) {
        System.out.println("Hw27 running");
        Box<Apple> appleBox = new Box<Apple>();

        appleBox.addFruit(new Apple(1));
        appleBox.addFruit(new Apple(2));
        appleBox.addFruit(new Apple(1));


        System.out.println(appleBox.getBoxWeight());

        Box<Orange> orangeBox = new Box<Orange>();

        orangeBox.addFruit(new Orange(1));
        orangeBox.addFruit(new Orange(2));
        orangeBox.addFruit(new Orange(2));

        System.out.println("apple box compare orange box: " + orangeBox.compare(appleBox));

        Box<Fruit> fruitBox =  new Box<Fruit>();
        fruitBox.addFruit(new Apple(1));
        fruitBox.addFruit(new Orange(2));
        fruitBox.addFruit(new Orange(1));

        System.out.println("apple box compare fruit box: " + appleBox.compare(fruitBox));

        System.out.println();
        System.out.println("apple box: ");
        appleBox.info();
        System.out.println("frui box: ");
        fruitBox.info();


        fruitBox.shiftFruits(appleBox);

        System.out.println();
        System.out.println("apple box: ");
        appleBox.info();
        System.out.println("frui box: ");
        fruitBox.info();



    }
}
