package ru.otus.java.basic.homeworks.homework21;

import java.util.Calendar;
import java.util.Date;

public class AppHw21 {

    public static void main(String[] args) throws InterruptedException {

        Calculation cal1 = new Calculation();

        //Один поток
        cal1.calc();

        //В несколько потоков
        startAsThread(4);

    }

    public static void startAsThread(int threadCount) {
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new Calculation("Thread_"+i,threadCount,i));
            thread.start();
        }
    }

}
