package ru.otus.java.basic.homeworks.homework30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppHw30 {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        PrintMethods methods = new PrintMethods();
        es.execute(methods::printA);
        es.execute(methods::printB);
        es.execute(methods::printC);

        es.shutdown();
    }
}
