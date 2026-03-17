package ru.otus.java.basic.homeworks.hw18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree implements SearchTree<Integer> {

    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    public void insertFromList(List<Integer> list) {
        int midIndx = 0;
        midIndx = list.size() / 2;
        int root = list.get(midIndx);
        insert(root);

        if (list.size() == 1) {return;}

        List<Integer> left = list.subList(0, midIndx);
        List<Integer> right = list.subList(midIndx+1, list.size());

        if (!left.isEmpty()){
            insertFromList(left);
        }

        if (!right.isEmpty()){
            insertFromList(right);
        }

    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    @Override
    public Integer find(Integer element) {
        return checkFindValue(root, element);
    }

    private Integer checkFindValue(Node root, Integer element){
        if (root == null) {return 0;}
        if (element == root.value) {
            return root.value;
        } else if (element < root.value) {
            return checkFindValue(root.left, element);}
        else {
            return checkFindValue(root.right, element);
        }
    }

    @Override
    public List<Integer> getSortedList() {
        List<Integer> list = new ArrayList<>();
        getTreeElements(root, list);
        return list;
    }

    private void getTreeElements(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        getTreeElements(root.left, list);
        list.add(root.value);
        getTreeElements(root.right, list);
    }
}
