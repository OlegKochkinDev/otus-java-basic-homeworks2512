package ru.otus.java.basic.homeworks.homework21;

import java.util.Date;

public class Calculation implements Runnable {
    private static double[] array = new double[100000000];

    private String threadName;
    private int threadCount;
    private int threadNum;

    public Calculation() {
        this.threadName = "Calculation";
        this.threadCount = 1;
        this.threadNum = 1;
    }

    public Calculation(String threadName, int threadCount, int threadNum) {
        this.threadName = threadName;
        this.threadCount = threadCount;
        this.threadNum = threadNum;
    }

    public void calc() {
        int start = 0;
        int end = 0;
        int size = array.length / threadCount;
        start = threadNum * size;
        end = (threadNum == threadCount - 1) ? array.length - 1 : (threadNum + 1) * size - 1;
        System.out.println(threadName + " started");
        if (threadCount == 1) {
            start = 0;
            end = array.length - 1;
        }

        System.out.println("    RANGE " + start + " to " + end + " element");
        for (int i = start; i <= end; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public void run() {
        calc();
    }


}
