package ru.otus.java.basic.homeworks.homework3;

import java.util.Random;
import java.util.Scanner;

public class AppHw3 {

    public static void main(String[] args) {
        System.out.println("homework3");
        //Каждый метод последовательно вызовите из метода main();
        //1. Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
        greetings();

        //(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c. Метод должен
        // посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
        // в противном случае - “Сумма отрицательная”
        checkSign(123, 456, 789);
        checkSign(123, 456, -789);

        //(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
        // Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20
        // включительно, то “Желтый”, если больше 20 - “Зеленый”;
        selectColor(5);
        selectColor(10);
        selectColor(14);
        selectColor(20);
        selectColor(25);

        //(4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными
        // значениями. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
        // в противном случае “a < b”;
        compareNumbers(5, 10);
        compareNumbers(10, 5);

        //(5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
        // Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат,
        // в противном случае - вычесть;
        addOrSubtractAndPrint(5, 10, true);
        addOrSubtractAndPrint(5, 10, false);

        //(*) При запуске приложения, запросите у пользователя число от 1 до 5, и
        // после ввода выполнения метод, соответствующий указанному номеру со случайным значением аргументов;
        boolean isRightChoise = false;
        int choise = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число от 1 до 5: ");
            //Тут всё таки по идее либо nextLine а потом проверять что может parseInt и обернуть исключениями
            //но вроде как это не проходили, поэтому оставляю так
            choise = sc.nextInt();
            if (choise >= 1 && choise <= 5) {

                break;
            }
            else {
                System.out.println("Введено неверное число!");
            }
        }
        switch (choise) {
            case 1:
                greetings();
                break;
            case 2:
                int a = new Random().nextInt() - new Random().nextInt();
                int b = new Random().nextInt() - new Random().nextInt();
                int c = new Random().nextInt() - new Random().nextInt();
                System.out.println("a: " + a + ",b: " + b + ",c: " + c);
                checkSign(a, b, c);
                break;
            case 3:
                int data = new Random().nextInt(30);
                System.out.println("data: " + data);
                selectColor(data);
                break;
            case 4:
                int a2 = new Random().nextInt() - new Random().nextInt();
                int b2 = new Random().nextInt() - new Random().nextInt();
                System.out.println("a2: " + a2 + ",b2: " + b2);
                compareNumbers(a2, b2);
                break;
            case 5:
                int initValue = new Random().nextInt() - new Random().nextInt();
                int delta  = new Random().nextInt() - new Random().nextInt();
                boolean increment = new Random().nextBoolean();
                System.out.println("initValue: " + initValue + ",delta: " + delta + ", increment: " + increment);
                addOrSubtractAndPrint(initValue, delta, increment);

        }

    }

    //(1).Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
    public static void greetings(){
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    //(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c. Метод должен
    // посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    // в противном случае - “Сумма отрицательная”
    public static void checkSign(int a, int b, int c){
        int sum = a + b + c;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    //(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    // Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20
    // включительно, то “Желтый”, если больше 20 - “Зеленый”;
    public static void selectColor(int data){

        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //(4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными
    // значениями. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    // в противном случае “a < b”;
    public static void compareNumbers(int a, int b){
        if (a>=b){
            System.out.println("a>=b");
        } else  {
            System.out.println("a<b");
        }
    }


    //(5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
    // Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат,
    // в противном случае - вычесть;
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment){
            System.out.println(initValue+delta);
        } else{
            System.out.println(initValue-delta);
        }
    }

}
