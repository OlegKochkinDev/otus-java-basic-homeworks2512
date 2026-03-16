package ru.otus.java.basic.homeworks.hw16;

import java.util.ArrayList;

public class Hw16App {


    public static void main(String[] args) throws WrongRangeException {
        ArrayList<Integer> list = createListFromRange(1,10);
        System.out.println(list);

        System.out.println("sumElementHigherThanFive: " +  sumElementHigherThanFive(list));
        replaceElementsByNumber(0,list);
        System.out.println(list);

        increaseElementsByNumber(1,list);
        System.out.println(list);

        Employee emp1 = new Employee("Oleg", 35);
        Employee emp2 = new Employee("Irina", 35);
        Employee emp3 = new Employee("Eugeniy", 40);
        Employee emp4 = new Employee("Sergio", 42);
        Employee emp5 = new Employee("Svetlana", 25);
        Employee emp6 = new Employee("Igor", 30);
        Employee emp7 = new Employee("Gennadiy", 50);
        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        emps.add(emp4);
        emps.add(emp5);
        emps.add(emp6);
        emps.add(emp7);

        ArrayList<String> names = getEmployeesNames(emps);
        System.out.println(names);
        ArrayList<Employee> empsByAge  = getEmployeesByAges(emps, 40);
        System.out.println(empsByAge);

        boolean isAverageAgeEmployee = isAverageAgeEmployee(emps, 30);
        System.out.println(isAverageAgeEmployee);

        Employee mostYoung = getMostYoungEmployee(emps);
        System.out.println(mostYoung);

    }


    public static ArrayList createListFromRange(int min, int max) throws WrongRangeException {
        int step = 1;
        int currValue = min;
        ArrayList<Integer> list = new ArrayList<>();
        if (min > max){
            throw new WrongRangeException("Указан неверный диапазон.");
        }
        if (max == min){
            list.add(currValue);
            return list;
        }
        while (currValue <= max) {
            list.add(currValue);
            currValue += step;
        }
        return list;
    }

    public static int sumElementHigherThanFive(ArrayList<Integer> list) {
        int sum = 0;
        for (int value : list) {
            if (value > 5) {
                sum  += value;
            }
        }
        return sum;
    }

    public static void replaceElementsByNumber(int newValue, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, newValue);
        }
    }
    public static void increaseElementsByNumber(int increment, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + increment);
        }
    }

    public static ArrayList<String> getEmployeesNames(ArrayList<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    public static ArrayList<Employee> getEmployeesByAges(ArrayList<Employee> employees, int age) {
        ArrayList<Employee> emps = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= age) {
                emps.add(employee);
            }
        }
        return emps;
    }

    public static boolean isAverageAgeEmployee(ArrayList<Employee> employees, int avgAge) {
        int listAvgAge = 0;
        for (Employee employee : employees) {
            listAvgAge += employee.getAge();
        }

        listAvgAge = listAvgAge / employees.size();

        return listAvgAge >= avgAge;
    }

    public static Employee getMostYoungEmployee(ArrayList<Employee> employees) {
        int minAge = Integer.MAX_VALUE;
        Employee mostYoung = null;
        for (Employee employee : employees) {
            if (employee.getAge() < minAge){
                minAge = employee.getAge();
                mostYoung = employee;
            }
        }
        return mostYoung;
    }


}

