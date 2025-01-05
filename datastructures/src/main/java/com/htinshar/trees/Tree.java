package com.htinshar.trees;

public class Tree {
    private TreeNode root;

    public void add(int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insertData(data);
        }
    }

    public void transverseData() {
        if(root == null) {
            System.out.println("Tree is empty");
            return;
        }
        root.transverseTree();
    }
}
