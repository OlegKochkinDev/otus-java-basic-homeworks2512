package ru.otus.java.basic.homeworks.homework30;

public class PrintMethods {

    public static final Object mon = new Object();
    public static char symbol = 'A';

    public void printA() {
        synchronized (mon) {
            for (int i = 0; i < 5; i++) {
                while (symbol != 'A') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print("A");
                symbol = 'B';
                mon.notifyAll();
            }

        }
    }

    public void printB() {
        synchronized (mon) {
            for (int i = 0; i < 5; i++) {
                while (symbol != 'B') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print("B");
                symbol = 'C';
                mon.notifyAll();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            for (int i = 0; i < 5; i++) {
                while (symbol != 'C') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print("C");
                symbol = 'A';
                mon.notifyAll();
            }
        }
    }


}


