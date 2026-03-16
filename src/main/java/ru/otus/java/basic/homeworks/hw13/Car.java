package ru.otus.java.basic.homeworks.hw13;

public class Car implements Driveable{

    int gasoline;
    int gasolineConsumption = 1; //расход условной еденицы топлива на условную еденицу расстояния


    public Car(int gasoline){
        this.gasoline = gasoline;
    }

    public boolean drive(int distance, Terrain terrain) {
        boolean isAllDistance = false;

        if (terrain == Terrain.FOREST || terrain == Terrain.SWAMP) {
            System.out.println("Машина не может проехать по " + terrain);
            return isAllDistance;
        }

        System.out.println("Машина начинает движение по местности " + terrain + " на расстояние " + distance +". Бензина - " + gasoline + " единиц");
        int gasolineNeeded =  distance/gasolineConsumption;
        System.out.println("Нужно бензина для этого расстояния (при расходе "+gasolineConsumption+") = " + gasolineNeeded);
        int resultDistance = 0;
        //Бензина потребуется больше, чем есть
        if (gasolineNeeded > gasoline) {
            resultDistance = gasoline*gasolineConsumption;
            gasoline = 0;

        } else{
            resultDistance = distance;
            gasoline -= gasolineNeeded;
            isAllDistance = true;
        }
        System.out.println("Машина проехала расстояние " + resultDistance + ". Бензина осталось: " + gasoline +"."+ ((isAllDistance) ? " Доехал":" Не доехал"));

        return isAllDistance;
    }

    @Override
    public String toString() {
        return "Машина";
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }
}
