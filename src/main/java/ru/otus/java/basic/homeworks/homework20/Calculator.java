package ru.otus.java.basic.homeworks.homework20;

import java.util.Scanner;

public class Calculator {




    public static float calculate(float first, float second, char operator) {
        float result = 0;
        switch (operator) {
            case '+':
                result = sum(first, second);
                break;
            case '-':
                result = sub(first, second);
                break;
            case '*':
                result = mul(first, second);
                break;
            case  '/':
                result = div(first, second);
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static float sub(float a, float b) {
        return a - b;
    }

    public static float mul(float a, float b) {
        return a * b;
    }

    public static float div(float a, float b) {
        return a / b;
    }

    public static float mod(float a, float b) {
        return a % b;
    }


    public static float calculateFromString(String string) {
       float first = 0;
       float second = 0;
       char operator = 0;
       int operatorIndex = -1;

       float result = 0;


        // ищем оператор
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operator = c;
                operatorIndex = i;
                break;
            }
        }

        if (operatorIndex == -1) {
            System.out.println("Оператор не найден!");
            return 0;
        }

        // разбиваем строку
        try {
            first = Float.parseFloat(string.substring(0, operatorIndex));
            second = Float.parseFloat(string.substring(operatorIndex + 1));
        }catch (NumberFormatException e) {
            System.out.println("Строка не соответсвует формату. [NUMBER][OPERATOR][NUMBER]");
        }


        return calculate(first, second, operator);

    }



}
