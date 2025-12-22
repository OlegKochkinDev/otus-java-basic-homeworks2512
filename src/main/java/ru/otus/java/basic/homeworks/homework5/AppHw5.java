package ru.otus.java.basic.homeworks.homework5;

import java.util.Arrays;

public class AppHw5 {
    public static void main(String[] args) {
        System.out.println("Homework 5");
        //-Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
        System.out.println("1):");
        printNTimes(10, "Java is easy (lol, realy is not)");

        //Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
        System.out.println("2):");
        sumElementsBiggerThanFive(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        //Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.
        System.out.println("3):");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array before: " + Arrays.toString(arr));
        replaceDataInArray(5, arr);
        System.out.println("Array after: " + Arrays.toString(arr));

        //Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент которого на указанное число.
        System.out.println("4):");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array before: " + Arrays.toString(arr2));
        addNumberToEachElementInArray(2, arr2);
        System.out.println("Array after: " + Arrays.toString(arr2));

        //Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль сумма элементов какой из половин массива больше.
        System.out.println("5):");
        int[] arr3 = {2, 2, 2, 2, 2, 6, 1, 1, 1, 1, 1};
        whichHalfIsLarger(arr3);


    }

    //Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
    public static void printNTimes(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    //Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
    public static void sumElementsBiggerThanFive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("Result sum: " + sum);
    }

    //Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.
    public static void replaceDataInArray(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
    }

    //Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.
    public static void addNumberToEachElementInArray(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;
        }
    }

    //Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль сумма элементов какой из половин массива больше.
    public static void whichHalfIsLarger(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;

        int magicNum = 0;

        if (arr.length % 2 == 1) {
            magicNum = 1;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            sumLeft += arr[i];
        }
        //Если кол-во элекментов в массиве нечетное, то средним элементом можно пренебречь
        for (int i = arr.length / 2 + magicNum; i < arr.length; i++) {
            sumRight += arr[i];
        }

        if (sumRight > sumLeft) {
            System.out.println("Сумма правой половины массива больше");
        } else if (sumLeft > sumRight) {
            System.out.println("Сумма левой половины массива больше");
        } else {
            System.out.println("Суммы равны");
        }
    }
}
