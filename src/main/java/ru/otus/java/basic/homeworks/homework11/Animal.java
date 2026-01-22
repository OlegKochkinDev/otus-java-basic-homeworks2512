package ru.otus.java.basic.homeworks.homework11;

public class Animal {
    private String name;
    private int runningSpeed;
    private int swimmingSpeed;
    private int stamina;
    private int runStaminaCost = 1;
    private int swimStaminaCost;
    private boolean isTired = false;

    public Animal(String name, int runningSpeed, int swimmingSpeed, int stamina, int swimStaminaCost) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
        this.swimStaminaCost = swimStaminaCost;
    }

    public int run(int distance) {
        System.out.println(name + " бежит дистанцию в " + distance + " метров");
        int timeForDistance = distance/runningSpeed;
        int staminaRest = stamina - (distance/runStaminaCost);

        if (staminaRest < 0){
            isTired = true;
            return -1;
        }

        return timeForDistance;
    }

    public int swim(int distance) {
        System.out.println(name + " плавет дистанцию в " + distance + " метров");
        int timeForDistance = distance/swimmingSpeed;
        int staminaRest = stamina - (distance/swimStaminaCost);

        if (staminaRest < 0){
            isTired = true;
            return -1;
        }

        return timeForDistance;
    }

    public void info(){
        System.out.println(name + " " + (isTired?"устал":"полон сил"));
    }




}
