package ru.otus.java.basic.homeworks.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean eat(Plate plate){
        if (plate.getCurrentFoodAmount() < appetite){
            return false;
        } else{
            plate.deacreaseFood(appetite);
            return true;
        }
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void getSatietyInfo(){
        if (satiety){
            System.out.println(name + " сытый");
        }else{
            System.out.println(name + " голоден");
        }
    }
}

