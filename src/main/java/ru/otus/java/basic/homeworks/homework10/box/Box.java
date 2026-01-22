package ru.otus.java.basic.homeworks.homework10.box;

public class Box {

    private int size;
    private String color;
    private boolean isOpened = false;
    private String item = "";

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void setColor(String color) {
        System.out.println("New box color: " + color);
        this.color = color;
    }

    public void openBox(){
        System.out.println("open box");
        isOpened = true;
    }

    public void closeBox(){
        System.out.println("close box");
        isOpened = false;
    }

    public void getInfo(){
        System.out.println(color + " Box. Size: " + size + ". "+ (isOpened ?  "opened" : "closed"));
        if (!this.item.isEmpty()){
            System.out.println("Box contains " + this.item);
        } else{
            System.out.println("Box is empty");
        }
    }

    public void putInItem(String item){
        if(isOpened){
            if (this.item.isEmpty()){
                System.out.println(item + " put in box");
                this.item = item;
            } else{
                System.out.println("box already contains " + this.item);
            }
        }else{
            System.out.println("Box is closed!");
        }
    }

    public void removeItem(){
        if(isOpened){
            if (!item.isEmpty()){
                System.out.println(item + " remove from box");
                this.item = "";
            } else{
                System.out.println("There is nothing in the box");
            }
        }else{
            System.out.println("Box is closed!");
        }
    }

}
