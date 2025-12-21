package ru.otus.java.basic.homeworks.homework7;

public class AppHw7 {
    public static void main(String[] args) {
        System.out.println("homework7");
        //Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
        // метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
        System.out.println("Task 1:");
        int[][] m1 = {{1,-2,3},{-4,5,6},{-7,-8,-9}};
        int result1 = sumOfPositiveElements(m1);
        System.out.println("  result of the 1-st task: " + result1);

        //Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из
        // символов * со сторонами соответствующей длины;
        System.out.println();
        System.out.println("Task 2:");
        drawSquare(20);


        //Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его диагональные
        // элементы (можете выбрать любую из диагоналей, или занулить обе);
        System.out.println();
        System.out.println("Task 3:");
        int[][] m2 = {{1,-2,3},{-4,5,6},{-7,-8,-9}};
        System.out.println("  matrix before: ");
        printMatrix(m2);
        zeroDiagonal(m2);
        System.out.println("  matrix after: ");
        printMatrix(m2);

        //Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
        System.out.println();
        System.out.println("Task 4:");
        int[][] m3 = {{1,-2,3},{-4,5,6},{-7,-8,-9}};
        int max = findMax(m3);
        System.out.println("  result task 4: " + max);

        //Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки
        // не существует, то в качестве результата необходимо вернуть -1
        System.out.println();
        System.out.println("Task 5:");
        int[][] m4 = {{1,-2,3},{-4,5,6},{-7,-8,-9},{11,12,3}};
        int sum = sumOfSecondRows(m4);
        System.out.println("  result task 5 (second row exists): "  + sum);
        int[][] m5 = {{1,-2,3}};
        sum = sumOfSecondRows(m5);
        System.out.println("  result task 5 (second row NOT exists): " + sum);

    }

    //Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
    // метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
    public static int sumOfPositiveElements(int[][] matrix){
        int result_sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    result_sum += matrix[i][j];
                }
            }
        }
        return result_sum;
    }


    //Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из
    // символов * со сторонами соответствующей длины;
    public static void drawSquare(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else  {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    //Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его диагональные
    // элементы (можете выбрать любую из диагоналей, или занулить обе);
    public static void zeroDiagonal(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i+j == matrix.length - 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    //Выводить в консоль двумерный массив
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println();
        }
    }

    //Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
    public static int findMax(int[][] matrix){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    //Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки
    // не существует, то в качестве результата необходимо вернуть -1

    public static int sumOfSecondRows(int[][] matrix){
        int sum = 0;

        if (matrix.length <= 1){
            return -1;
        } else{
            for (int i = 0; i < matrix[1].length; i++) {
                sum += matrix[1][i];
            }
        }

        return sum;
    }

}


/*






 */