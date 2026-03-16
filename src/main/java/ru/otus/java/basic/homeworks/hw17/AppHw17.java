package ru.otus.java.basic.homeworks.hw17;

public class AppHw17 {


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("79163329452","Kochkin Oleg Vladimirovich");
        phoneBook.add("79169999999","Kochkin Oleg Vladimirovich");
        phoneBook.add("79329990000","Kochkin Petr Petrovich");
        phoneBook.add("79329990001","Sidorov Nikolay Javavich");
        phoneBook.add("79329990002","Gazinchuk Petr Michaelovich");
        phoneBook.add("79329990003","Petrov Boris Jackovich");
        phoneBook.add("79329990004","Semenov Victor Danielovich");
        phoneBook.add("79329990005","Kotov Eugeniy Josefiovich");
        phoneBook.add("79329990006","Volkov Gennadiy Blablabovich");




        System.out.println("FOUND RECORDS by oleg: ");
        System.out.println(PhoneBook.findByName("oleg"));
        System.out.println("FOUND RECORDS by KOCHKIN: ");
        System.out.println(PhoneBook.findByName("KOCHKIN"));
        System.out.println("FOUND RECORDS by Eugeniy: ");
        System.out.println(PhoneBook.findByName("Eugeniy"));

        System.out.println("containsPhoneNumber 79163329452:  " +  phoneBook.containsPhoneNumber("79163329452"));
        System.out.println("containsPhoneNumber 74991200562:  " +  phoneBook.containsPhoneNumber("74991200562"));

    }
}


