package ru.otus.java.basic.homeworks.hw13;

public class AppHw13 {


    public static void main(String[] args) {

        Human oleg = new Human("Oleg");

        Car car = new Car(20);
        AllTerrainVehicle ath = new AllTerrainVehicle(100);
        Horse zorka = new Horse(50);
        Bycicle bycicle = new Bycicle();


        oleg.move(10, Terrain.SWAMP);
        oleg.move(10, Terrain.FOREST);
        oleg.move(10, Terrain.PLAIN);

        System.out.println("---------------");
        oleg.getIn(car);
        oleg.move(100, Terrain.SWAMP);
        oleg.move(100, Terrain.FOREST);
        oleg.move(100, Terrain.PLAIN);
        car.setGasoline(20);
        oleg.move(20, Terrain.PLAIN);
        oleg.getOut();
        System.out.println("---------------");
        oleg.getIn(ath);
        oleg.move(100, Terrain.SWAMP);
        oleg.move(100, Terrain.FOREST);
        ath.setGasoline(100);
        oleg.move(100, Terrain.PLAIN);
        oleg.getOut();
        System.out.println("---------------");
        oleg.getIn(zorka);
        oleg.move(10, Terrain.SWAMP);
        oleg.move(10, Terrain.FOREST);
        oleg.move(10, Terrain.PLAIN);
        oleg.getOut();
        System.out.println("---------------");
        oleg.getIn(bycicle);
        oleg.move(10, Terrain.SWAMP);
        oleg.move(10, Terrain.FOREST);
        oleg.move(10, Terrain.PLAIN);
        oleg.getOut();

    }
}



