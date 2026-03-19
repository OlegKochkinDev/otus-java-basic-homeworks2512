package ru.otus.java.basic.homeworks.homework21;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class AppHw21 {

    static ArrayList<Thread> threads = new ArrayList<Thread>();

    public static void main(String[] args) throws InterruptedException {

        Calculation cal1 = new Calculation();

        long msStart;
        long msEnd;

        //Один поток
        msStart = System.currentTimeMillis();
        cal1.calc();
        msEnd = System.currentTimeMillis();
        System.out.println("single thread: " + (msEnd - msStart) + "ms");

        //В несколько потоков
        msStart = System.currentTimeMillis();
        startAsThread(4);
        msEnd = System.currentTimeMillis();
        System.out.println("for thread: " + (msEnd - msStart) + "ms");

    }

    public static void startAsThread(int threadCount) throws InterruptedException {
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new Calculation("Thread_" + i, threadCount, i));
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }

    }

}
