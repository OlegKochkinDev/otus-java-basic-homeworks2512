package ru.otus.java.basic.homeworks.homework31;

public class ArrayMethods {

    public static int[] executeArray(int[] arr) {
        int lastIdxOfNumberOne = -1;
        int[] newArr;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                lastIdxOfNumberOne = i;
            }
        }
        if (lastIdxOfNumberOne == -1) {
            throw new RuntimeException();
        } else {
            lastIdxOfNumberOne += 1;
            newArr = new int[arr.length - lastIdxOfNumberOne];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = arr[i + lastIdxOfNumberOne];
            }
        }
        return newArr;
    }

    public static boolean checkArray(int[] arr) {
        int countOfOne = 0;
        int countOfTwo = 0;
        int countOfOther = 0;
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOfOne++;
            } else if (arr[i] == 2) {
                countOfTwo++;
            } else {
                countOfOther++;
            }
        }
        if (countOfOne > 0 && countOfTwo > 0 && countOfOther == 0) {
            return true;
        } else {
            return false;
        }
    }
}
