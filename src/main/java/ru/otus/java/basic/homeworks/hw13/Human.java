package ru.otus.java.basic.homeworks.hw13;

import com.sun.jdi.connect.Transport;

import javax.xml.transform.Source;


public class Human {
    private String name;
    private Driveable currentTransport;


    public Human(String name) {
        this.name = name;
    }

    public void getIn(Driveable transport) {
        currentTransport = transport;
        System.out.println(name + " использует в качестве транпорта " + currentTransport);
    }

    public void getOut() {
        currentTransport = null;
        System.out.println(name + " спешился");
    }


    public boolean move(int distance, Terrain terrain) {
        boolean isMoveAllDistance = false;
        if (currentTransport != null) {
            isMoveAllDistance = currentTransport.drive(distance, terrain);
            return isMoveAllDistance;
        }else {
            System.out.println(name + " не находится в транспорте.");
            System.out.println(name + " прошел всю дистанцию пешком");
            return true;
        }
    }

}


