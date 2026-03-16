package ru.otus.java.basic.homeworks.hw13;

import java.sql.Driver;

public class Bycicle implements Driveable {



    public boolean drive(int distance, Terrain terrain) {
        if  (terrain == Terrain.SWAMP) {
            System.out.println("Велосипед не может проехать по " + terrain);
            return false;
        }
        System.out.println("Велосипед проехал всю дистанцию");
        return true;
    }

    @Override
    public String toString() {
        return "Велосипед";
    }
}
