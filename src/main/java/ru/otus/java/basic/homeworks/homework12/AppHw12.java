package ru.otus.java.basic.homeworks.homework12;

public class AppHw12 {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Persik", 7);
        cats[2] = new Cat("Matroskin", 10);
        cats[3] = new Cat("Simba", 3);
        cats[4] = new Cat("Stesha", 2);

        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.setSatiety(cat.eat(plate));
            cat.getSatietyInfo();
        }

    }
}
