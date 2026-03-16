package ru.otus.java.basic.homeworks.hw13;

public enum Terrain {
    FOREST("Густой лес"),
    PLAIN("Равнина"),
    SWAMP("Болото");

    private String title;

    Terrain(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }

}
