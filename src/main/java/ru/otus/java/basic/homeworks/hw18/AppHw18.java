package ru.otus.java.basic.homeworks.hw18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppHw18 {



        public static void main(String[] args) {

            Integer[] arr = new Integer[] {10,20,30,40,50,60,70,80,90,100,110, 61};
            List<Integer> list  = Arrays.asList(arr);
            BinaryTree tree = new BinaryTree();
            tree.insertFromList(list);

            System.out.println(tree.find(50));
            System.out.println(tree.find(110));
            System.out.println(tree.find(60));
            System.out.println(tree.find(61));
            System.out.println(tree.find(55));

            System.out.println(tree.getSortedList());
        }

}
