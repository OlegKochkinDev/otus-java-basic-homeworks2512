package ru.otus.java.basic.homeworks.homework12;

public class Plate {
    private int maxFoodAmount;
    private int currentFoodAmount;

    public Plate(int maxFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
        this.currentFoodAmount = maxFoodAmount;
    }

    public void addFood(int foodAmount) {
        this.currentFoodAmount += foodAmount;
        if  (this.currentFoodAmount > this.maxFoodAmount) {
            this.currentFoodAmount = this.maxFoodAmount;
        }
    }

    public boolean deacreaseFood(int foodAmount) {
        this.currentFoodAmount -= foodAmount;
        return this.currentFoodAmount >= 0;

    }

    public int getCurrentFoodAmount() {
        return this.currentFoodAmount;
    }
}


