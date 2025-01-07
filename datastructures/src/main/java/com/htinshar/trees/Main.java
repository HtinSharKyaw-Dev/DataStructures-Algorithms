package com.htinshar.trees;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.add(23);
        intTree.add(34);
        intTree.add(13);
        intTree.add(15);
        intTree.add(27);
        intTree.add(29);
        intTree.add(37);
        intTree.add(17);
        intTree.add(22);

        intTree.transverseData();
        System.out.println();
        System.out.println(intTree.get(27));
        //System.out.println(intTree.get(17));

        System.out.println(intTree.getMin());
        System.out.println(intTree.getMax());
    }
}