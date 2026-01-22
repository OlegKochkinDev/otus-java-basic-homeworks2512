package ru.otus.java.basic.homeworks.homework10;

import java.time.LocalDate;


public class AppHw10 {

    public static void main(String[] args) {
        User[]  users = new User[10];
        int currentYearInt = LocalDate.now().getYear();

        users[0] = new User("Кочкин","Олег","Владимирович", 1990,"okochkin165@gmail.com");
        users[1] = new User("Петров","Иван","Сидорович", 1995,"fdjkggfdg43@gmail.com");
        users[2] = new User("Иванов","Петр","Олегович", 1985,"gfghfg54@gmail.com");
        users[3] = new User("Сидоров","Александр","Иванович", 1980,"ivanov542@gmail.com");
        users[4] = new User("Почкин","Артур","Александрович", 1975,"ghdsghsdf7@gmail.com");
        users[5] = new User("Бочкин","Адам","Артурович", 1970,"tyqwyeu3@gmail.com");
        users[6] = new User("Наволочкин","Дмитрий","Адамович", 2000,"qwerty123@gmail.com");
        users[7] = new User("Точкин","Сергей","Дмитриевич", 2005,"ololol3@gmail.com");
        users[8] = new User("Сочкин","Евгений","Сергеевич", 1970,"bbvbvbvbb44@gmail.com");
        users[9] = new User("Мочкина","Светлана","Евгеньевна", 1992,"polarbear999@gmail.com");

        for (User user : users) {
            if (currentYearInt - user.getBirthYear() >= 40){
                user.getInfo();
            }
        }


    }
}
