package ru.otus.java.basic.homeworks.hw13;

import javax.xml.transform.Source;

public class AllTerrainVehicle implements Driveable
{
    int gasoline;
    int gasolineConsumption = 2; //расход условной еденицы топлива на условную еденицу расстояния


    public AllTerrainVehicle(int gasoline){
        this.gasoline = gasoline;
    }

    public boolean drive(int distance, Terrain terrain) {
        boolean isAllDistance = false;
        System.out.println("Вездеход начинает движение по местности " + terrain + " на расстояние " + distance +". Бензина - " + gasoline + " единиц");
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
        System.out.println("Вездеход проехал расстояние " + resultDistance + ". Бензина осталось: " + gasoline+"." + ((isAllDistance) ? " Доехал":" Не доехал"));
        return isAllDistance;
    }

    @Override
    public String toString() {
        return "Вездеход";
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }
}
