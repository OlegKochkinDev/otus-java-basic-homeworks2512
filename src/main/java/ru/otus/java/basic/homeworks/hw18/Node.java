package ru.otus.java.basic.homeworks.hw18;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
