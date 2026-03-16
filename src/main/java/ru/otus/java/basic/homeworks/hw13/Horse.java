package ru.otus.java.basic.homeworks.hw13;

public class Horse implements Driveable {

    int stamina;
    int staminaConsumption = 1; //расход условной еденицы топлива на условную еденицу расстояния


    public Horse(int stamina){
        this.stamina = stamina;
    }

    public boolean drive(int distance, Terrain terrain) {
        boolean isAllDistance = false;

        if (terrain == Terrain.SWAMP) {
            System.out.println("Лошадь не может проехать по " + terrain);
            return isAllDistance;
        }

        System.out.println("Лошадь начинает движение по местности " + terrain + " на расстояние " + distance +". Выносливости - " + stamina + " единиц");
        int staminaNeeded =  distance/staminaConsumption;
        System.out.println("Нужно выносливости для этого расстояния (при расходе "+staminaConsumption+") = " + staminaNeeded);
        int resultDistance = 0;
        //Бензина потребуется больше, чем есть
        if (staminaNeeded > stamina) {
            resultDistance = stamina*staminaConsumption;
            stamina = 0;

        } else{
            resultDistance = distance;
            stamina -= staminaNeeded;
            isAllDistance = true;
        }
        System.out.println("Лошадь проехала расстояние " + resultDistance + ". Выносливости осталось: " + stamina+"." + ((isAllDistance) ? " Доехал":" Не доехал"));
        return isAllDistance;
    }

    @Override
    public String toString() {
        return "Лошадь";
    }


}
